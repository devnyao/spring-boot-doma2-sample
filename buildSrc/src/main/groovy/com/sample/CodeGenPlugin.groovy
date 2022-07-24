package com.sample

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * CodeGenタスク用のカスタムクラス
 * buildSrcにgroovyで実装していく。
 */
class CodeGenPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create("codegen", CodeGenPluginExtension.class)
        project.task("codegen", type: GenerateTask)
    }
}
