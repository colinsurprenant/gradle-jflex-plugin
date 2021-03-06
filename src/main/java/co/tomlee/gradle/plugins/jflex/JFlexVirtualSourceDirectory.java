package co.tomlee.gradle.plugins.jflex;

import groovy.lang.Closure;
import org.gradle.api.file.SourceDirectorySet;

public interface JFlexVirtualSourceDirectory {
    SourceDirectorySet getJflex();
    JFlexVirtualSourceDirectory jflex(Closure closure);
}
