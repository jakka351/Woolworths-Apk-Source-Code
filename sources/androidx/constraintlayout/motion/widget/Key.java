package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class Key {

    /* renamed from: a, reason: collision with root package name */
    public int f2329a = -1;
    public int b = -1;
    public String c = null;
    public HashMap d;

    public static float g(Number number) {
        return number instanceof Float ? ((Float) number).floatValue() : Float.parseFloat(number.toString());
    }

    public abstract void a(HashMap map);

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract Key clone();

    public Key c(Key key) {
        this.f2329a = key.f2329a;
        this.b = key.b;
        this.c = key.c;
        this.d = key.d;
        return this;
    }

    public abstract void d(HashSet hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap map) {
    }
}
