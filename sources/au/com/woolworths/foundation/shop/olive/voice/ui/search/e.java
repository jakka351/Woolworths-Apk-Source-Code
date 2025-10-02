package au.com.woolworths.foundation.shop.olive.voice.ui.search;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ VoiceSearchState e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ e(OliveVoiceViewModel oliveVoiceViewModel, VoiceAnalytics voiceAnalytics, VoiceSearchState voiceSearchState, Function0 function0, Function1 function1, Function1 function12, Function0 function02, boolean z, boolean z2, boolean z3, int i, int i2) {
        this.n = oliveVoiceViewModel;
        this.o = voiceAnalytics;
        this.e = voiceSearchState;
        this.f = function0;
        this.h = function1;
        this.p = function12;
        this.g = function02;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = i;
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                OliveVoiceSearchScreenKt.b((OliveVoiceViewModel) this.n, (VoiceAnalytics) this.o, this.e, this.f, this.h, (Function1) this.p, this.g, this.i, this.j, this.k, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1), RecomposeScopeImplKt.a(this.m));
                break;
            default:
                ((Integer) obj2).getClass();
                OliveVoiceSearchScreenKt.c(this.e, this.f, this.g, (Function0) this.n, (Function0) this.o, this.h, this.i, this.j, this.k, (Modifier) this.p, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1), this.m);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ e(VoiceSearchState voiceSearchState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, boolean z, boolean z2, boolean z3, Modifier modifier, int i, int i2) {
        this.e = voiceSearchState;
        this.f = function0;
        this.g = function02;
        this.n = function03;
        this.o = function04;
        this.h = function1;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.p = modifier;
        this.l = i;
        this.m = i2;
    }
}
