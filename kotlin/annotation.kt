// Annotation is metadata
// not execute code, describes code

// Who reads annotations:
// - compiler
// - frameworks
// - static analysis tools

// Usage

@Deprecated("Use newApi()")
fun oldApi() {}

data class User(
    @NotNull val name: String
)


// TODO: Understand it more