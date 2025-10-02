package au.com.woolworths.design.wx.component;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Shape h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ BorderStroke k;
    public final /* synthetic */ float l;
    public final /* synthetic */ MutableInteractionSource m;
    public final /* synthetic */ ComposableLambdaImpl n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ a(Function0 function0, Modifier modifier, boolean z, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, ComposableLambdaImpl composableLambdaImpl, int i, int i2, int i3) {
        this.d = i3;
        this.e = function0;
        this.f = modifier;
        this.g = z;
        this.h = shape;
        this.i = j;
        this.j = j2;
        this.k = borderStroke;
        this.l = f;
        this.m = mutableInteractionSource;
        this.n = composableLambdaImpl;
        this.o = i;
        this.p = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                CardKt.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, composer, RecomposeScopeImplKt.a(this.o | 1), this.p);
                break;
            default:
                ((Integer) obj2).getClass();
                SurfaceKt.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, composer, RecomposeScopeImplKt.a(this.o | 1), this.p);
                break;
        }
        return Unit.f24250a;
    }
}
