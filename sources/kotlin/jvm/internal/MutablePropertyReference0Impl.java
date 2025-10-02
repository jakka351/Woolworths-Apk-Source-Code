package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class MutablePropertyReference0Impl extends MutablePropertyReference0 {
    public Object get() {
        return getGetter().call(new Object[0]);
    }
}
