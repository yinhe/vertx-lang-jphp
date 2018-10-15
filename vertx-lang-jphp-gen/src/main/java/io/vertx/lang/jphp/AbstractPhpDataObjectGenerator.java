package io.vertx.lang.jphp;

import io.vertx.codegen.DataObjectModel;

import java.util.Collections;

public abstract class AbstractPhpDataObjectGenerator extends PhpGenerator<DataObjectModel> {
    public AbstractPhpDataObjectGenerator() {
        this.kinds = Collections.singleton("dataObject");
    }
}