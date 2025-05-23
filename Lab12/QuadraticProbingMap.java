// 定义MyMap接口
interface MyMap {
    void put(int key, Object value);
    Object get(int key);
    void remove(int key);
}

// 哈希映射的实现类（采用开放寻址和二次探测）
public class QuadraticProbingMap implements MyMap {
    private static final int INITIAL_SIZE = 4;
    private static final double LOAD_FACTOR_THRESHOLD = 0.5;

    private static class Entry {
        int key;
        Object value;
        boolean isDeleted; // 标记删除状态

        Entry(int key, Object value) {
            this.key = key;
            this.value = value;
            this.isDeleted = false;
        }
    }

    private Entry[] table;
    private int size;   // 当前表大小
    private int count;  // 已存元素数（不包括被删除的元素）

    public QuadraticProbingMap() {
        this.size = INITIAL_SIZE;
        this.table = new Entry[size];
        this.count = 0;
    }

    // 简单的哈希函数
    private int hash(int key) {
        return key % size;
    }

    @Override
    public void put(int key, Object value) {
        if ((double) (count + 1) / size > LOAD_FACTOR_THRESHOLD) {
            resize();
        }

        int index = hash(key);
        int i = 0;
        int probeIndex;

        while (true) {
            probeIndex = (index + i * i) % size;
            Entry e = table[probeIndex];

            if (e == null || e.isDeleted) {
                // 空位置或已删除，插入
                table[probeIndex] = new Entry(key, value);
                count++;
                return;
            } else if (e.key == key) {
                // 更新已有的键
                e.value = value;
                return;
            } else {
                i++;
            }
        }
    }

    @Override
    public Object get(int key) {
        int index = hash(key);
        int i = 0;
        int probeIndex;

        while (true) {
            probeIndex = (index + i * i) % size;
            Entry e = table[probeIndex];

            if (e == null) {
                return null; // 未找到
            } else if (!e.isDeleted && e.key == key) {
                return e.value;
            } else {
                i++;
                if (i >= size) {
                    return null; // 避免无限循环
                }
            }
        }
    }

    @Override
    public void remove(int key) {
        int index = hash(key);
        int i = 0;
        int probeIndex;

        while (true) {
            probeIndex = (index + i * i) % size;
            Entry e = table[probeIndex];

            if (e == null) {
                return; // 没有找到要删除的键
            } else if (!e.isDeleted && e.key == key) {
                // 标记为已删除
                e.isDeleted = true;
                count--;
                return;
            } else {
                i++;
                if (i >= size) {
                    return;
                }
            }
        }
    }

    private void resize() {
        int newSize = size * 2;
        Entry[] oldTable = table;
        table = new Entry[newSize];
        int oldSize = size;
        size = newSize;
        count = 0;

        for (int i = 0; i < oldSize; i++) {
            Entry e = oldTable[i];
            if (e != null && !e.isDeleted) {
                // 重新插入旧元素
                put(e.key, e.value);
            }
        }
    }

    // 测试方法
    public static void main(String[] args) {
        QuadraticProbingMap map = new QuadraticProbingMap();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five"); // 触发扩容

        System.out.println(map.get(1)); // 输出 One
        System.out.println(map.get(2)); // 输出 Two
        System.out.println(map.get(6)); // 输出 null

        map.remove(3);
        System.out.println(map.get(3)); // 输出 null
    }
} 