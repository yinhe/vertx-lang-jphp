package io.vertx.php.ext.auth.htdigest;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.AuthProvider;
import io.vertx.php.ext.auth.User;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HtdigestAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\htdigest")
@SuppressWarnings("ALL")
public class HtdigestAuth extends VertxGenVariable0Wrapper<io.vertx.ext.auth.htdigest.HtdigestAuth>{
    
    private HtdigestAuth(Environment env, io.vertx.ext.auth.htdigest.HtdigestAuth wrappedObject){
        super(env, wrappedObject);
    }
    public static  HtdigestAuth __create(Environment env, io.vertx.ext.auth.htdigest.HtdigestAuth wrappedObject){
        return new HtdigestAuth(env, wrappedObject);
    }

    @Signature
    public void authenticate(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().authenticate(Utils.convParamJsonObject(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.auth.User, User>create0(User.class, User::__create), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.auth.htdigest.HtdigestAuth, HtdigestAuth>convReturnVertxGenVariable0(__ENV__, HtdigestAuth.class, HtdigestAuth::__create, io.vertx.ext.auth.htdigest.HtdigestAuth.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.auth.htdigest.HtdigestAuth, HtdigestAuth>convReturnVertxGenVariable0(__ENV__, HtdigestAuth.class, HtdigestAuth::__create, io.vertx.ext.auth.htdigest.HtdigestAuth.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory realm(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().realm());
    }/*1*/

}