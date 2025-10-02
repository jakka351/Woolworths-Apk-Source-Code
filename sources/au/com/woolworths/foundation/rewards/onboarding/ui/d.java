package au.com.woolworths.foundation.rewards.onboarding.ui;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerKt;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListActionState;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeUiKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ d(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, String str, boolean z, Function0 function0, PopupProperties popupProperties, CoachMarkFrameAlignment coachMarkFrameAlignment, ComposableLambdaImpl composableLambdaImpl2, int i, int i2) {
        this.j = composableLambdaImpl;
        this.h = modifier;
        this.l = str;
        this.e = z;
        this.g = function0;
        this.m = popupProperties;
        this.n = coachMarkFrameAlignment;
        this.k = composableLambdaImpl2;
        this.f = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                CoachMarkFrameKt.a((ComposableLambdaImpl) this.j, this.h, (String) this.l, this.e, this.g, (PopupProperties) this.m, (CoachMarkFrameAlignment) this.n, (ComposableLambdaImpl) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.i);
                break;
            case 1:
                ((Integer) obj2).getClass();
                VideoAdPlayerKt.c(this.e, (ExoPlayer) this.j, (Context) this.k, (Player.Listener) this.l, this.f, (Bitmap) this.m, (Function1) this.n, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ScrollableListUiKt.c((String) this.l, (String) this.k, (String) this.m, this.g, (ScrollableListActionState) this.n, this.h, this.e, (ComposableLambdaImpl) this.j, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                PromoCodeUiKt.a(this.e, (ModalBottomSheetData.PromoCode) this.j, (Function1) this.k, this.g, (Function1) this.l, (Function0) this.m, (Function1) this.n, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.i);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(String str, String str2, String str3, Function0 function0, ScrollableListActionState scrollableListActionState, Modifier modifier, boolean z, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.l = str;
        this.k = str2;
        this.m = str3;
        this.g = function0;
        this.n = scrollableListActionState;
        this.h = modifier;
        this.e = z;
        this.j = composableLambdaImpl;
        this.f = i;
        this.i = i2;
    }

    public /* synthetic */ d(boolean z, ExoPlayer exoPlayer, Context context, Player.Listener listener, int i, Bitmap bitmap, Function1 function1, Function0 function0, Modifier modifier, int i2) {
        this.e = z;
        this.j = exoPlayer;
        this.k = context;
        this.l = listener;
        this.f = i;
        this.m = bitmap;
        this.n = function1;
        this.g = function0;
        this.h = modifier;
        this.i = i2;
    }

    public /* synthetic */ d(boolean z, ModalBottomSheetData.PromoCode promoCode, Function1 function1, Function0 function0, Function1 function12, Function0 function02, Function1 function13, Modifier modifier, int i, int i2) {
        this.e = z;
        this.j = promoCode;
        this.k = function1;
        this.g = function0;
        this.l = function12;
        this.m = function02;
        this.n = function13;
        this.h = modifier;
        this.f = i;
        this.i = i2;
    }
}
