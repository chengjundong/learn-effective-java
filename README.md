# Builder模式
- 构造器参数较多
- 有必要参数 和 可选参数

# Clone
- Clonable接口并不是最好的选择
- 提供一个clone factory方法, `XXX XXXFactory.clone(XXX x)`。在内部实现自定义的内容拷贝。

# 数字下划线
```
// Java 7开始，数字支持加入下划线
// 作用类似统计中的分隔符 100,200
// 方便阅读
// a的实际值依旧是 100200
int a = 100_200;
```

# 不要使用常量接口
- 常量接口会导致参数暴露, `java.io.ObjectStreamConstants`
- 使用常量类, `java.lang.Integer.MIN_VALUE`

# 不要使用泛型+Varargs
- `void do(List<String>...lists)` 由于数组对于泛型的支持很弱，并且varargs是基于数组的，所以不要同时使用泛型和可变参数
- `java.lang.SafeVarargs` 如果有必要使用这种组合，请标记这个注解

# 关于枚举
- 使用EnumSet和EnumMap
- 不要使用序数 `ordinal()` 方法，不可靠

# 标记的两种方法
- 标记接口， `java.io.Serializable`
- 标记注解，`java.lang.annotation.Native`
- 接口更精准；注解可以使用在基于注解的框架内，更灵活

# 基于Map的统计
统计某个key对应的值，存在：value+1，不存在：放入1。  
例如，统计某些单词的词频等应用。
```
HashMap<String,Integer> map = new HashMap<>();
		
map.put("hello", 1);

// 使用merge方法对key存在的value，进行操作
// 具体操作，则是第三个参数, Integer::sum
// 能使用方法引用的地方，就避免用lambda，因为更清晰和精准
map.merge("hello", 1, Integer::sum);
map.merge("world", 1, Integer::sum);

System.out.println(map.get("hello"));
System.out.println(map.get("world"));

```

# JAVA 8 Instant
Date类已经过时了，在Java 8及以后，要使用Instant类  
`java.time.Instant`

# 慎用 Optional
- 永远不要用Optional来返回null
- 集合中不应该出现Optional

# 使用StringBuilder连接字符串
任何时候，都不要直接使用字符串拼接

# 异常
- 使用@throws 说明抛出的异常
- 尽量使用标准异常
- 保持失败原子性，避免产生副作用

