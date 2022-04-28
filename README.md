# kmap-test
A trivial test for kmap processor

WHen compiled using gradle, everything goes fine but when compiled using IntelliJ, the following error occurs

```
Kotlin: [Internal Error] java.lang.IllegalStateException: The provided plugin com.google.devtools.ksp.KotlinSymbolProcessingComponentRegistrar is not compatible with this version of compiler
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment$Companion.registerExtensionsFromPlugins$cli(KotlinCoreEnvironment.kt:667)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment$ProjectEnvironment.registerExtensionsFromPlugins(KotlinCoreEnvironment.kt:169)
...
  at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.AbstractMethodError: Receiver class com.google.devtools.ksp.KotlinSymbolProcessingComponentRegistrar does not define or inherit an implementation of the resolved method abstract registerProjectComponents(Lcom/intellij/mock/MockProject;Lorg/jetbrains/kotlin/config/CompilerConfiguration;)V of interface org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar.
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment$Companion.registerExtensionsFromPlugins$cli(KotlinCoreEnvironment.kt:659)
	... 28 more
```
