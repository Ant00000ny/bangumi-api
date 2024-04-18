# bangumi-api

A kotlin implementation of [bangumi api](https://bangumi.github.io/api).

## Example Usage

```kotlin
fun main() {
    val bangumiClient = BangumiClient("MY_ACCESS_TOKEN") // token is optional for public API
    val user = bangumiClient.execute(GetUserByName("155125"))
    println(user.nickname)
}
```

See [api tests](src/test/kotlin/fun/fantasea/bangumiapi/api) for more examples.


## Maven Dependency

```xml
<dependency>
    <groupId>fun.fantasea</groupId>
    <artifactId>bangumi-api</artifactId>
    <version>CHANGE_THIS_TO_LATEST</version>
</dependency>
```
