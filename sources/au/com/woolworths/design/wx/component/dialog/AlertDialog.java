package au.com.woolworths.design.wx.component.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/wx/component/dialog/AlertDialog;", "", "design-wx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AlertDialog {

    /* renamed from: a, reason: collision with root package name */
    public static final AlertDialog f5143a = new AlertDialog();

    public final void a(final Function0 onDismissRequest, final String confirmButtonText, final Function0 onConfirmButtonClick, final String dismissButtonText, final Function0 onDismissButtonClick, Modifier modifier, String str, final String str2, DismissButtonStyle dismissButtonStyle, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str3;
        int i5;
        long jC;
        final String str4;
        Modifier modifier3;
        final DismissButtonStyle dismissButtonStyle2;
        long j3;
        final long j4;
        final long j5;
        final Modifier modifier4;
        ComposerImpl composerImpl;
        final DismissButtonStyle dismissButtonStyle3;
        Intrinsics.h(onDismissRequest, "onDismissRequest");
        Intrinsics.h(confirmButtonText, "confirmButtonText");
        Intrinsics.h(onConfirmButtonClick, "onConfirmButtonClick");
        Intrinsics.h(dismissButtonText, "dismissButtonText");
        Intrinsics.h(onDismissButtonClick, "onDismissButtonClick");
        ComposerImpl composerImplV = composer.v(361027369);
        if ((i & 6) == 0) {
            i3 = i | (composerImplV.I(onDismissRequest) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | (composerImplV.n(confirmButtonText) ? 32 : 16) | (composerImplV.I(onConfirmButtonClick) ? 256 : 128) | (composerImplV.n(dismissButtonText) ? 2048 : 1024) | (composerImplV.I(onDismissButtonClick) ? 16384 : 8192);
        int i7 = i2 & 32;
        if (i7 != 0) {
            i4 = i6 | 196608;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i6 | (composerImplV.n(modifier2) ? 131072 : 65536);
        }
        int i8 = i2 & 64;
        if (i8 != 0) {
            i5 = i4 | 1572864;
            str3 = str;
        } else {
            str3 = str;
            i5 = i4 | (composerImplV.n(str3) ? 1048576 : 524288);
        }
        int i9 = i5 | (composerImplV.n(str2) ? 8388608 : 4194304) | 905969664;
        if ((306783379 & i9) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            j4 = j;
            j5 = j2;
            modifier4 = modifier2;
            str4 = str3;
            composerImpl = composerImplV;
            dismissButtonStyle3 = dismissButtonStyle;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                Modifier modifier5 = i7 != 0 ? Modifier.Companion.d : modifier2;
                String str5 = i8 != 0 ? null : str3;
                DismissButtonStyle dismissButtonStyle4 = DismissButtonStyle.d;
                long jA = WxTheme.a(composerImplV).a();
                jC = WxTheme.a(composerImplV).c();
                str4 = str5;
                modifier3 = modifier5;
                dismissButtonStyle2 = dismissButtonStyle4;
                j3 = jA;
            } else {
                composerImplV.j();
                dismissButtonStyle2 = dismissButtonStyle;
                jC = j2;
                modifier3 = modifier2;
                str4 = str3;
                j3 = j;
            }
            composerImplV.W();
            int i10 = 199680 | ((i9 << 6) & 896) | ((i9 >> 3) & 57344) | (i9 & 3670016) | (i9 & 29360128);
            long j6 = jC;
            long j7 = j3;
            AlertDialogKt.a(j7, j6, onDismissRequest, ComposableLambdaKt.c(1891955935, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.component.dialog.AlertDialog$BothButtons$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        AlertDialogKt.c(confirmButtonText, onConfirmButtonClick, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), modifier3, ComposableLambdaKt.c(-1902808803, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.component.dialog.AlertDialog$BothButtons$2

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[DismissButtonStyle.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            DismissButtonStyle dismissButtonStyle = DismissButtonStyle.d;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        int iOrdinal = dismissButtonStyle2.ordinal();
                        Function0 function0 = onDismissButtonClick;
                        String str6 = dismissButtonText;
                        if (iOrdinal == 0) {
                            composer2.o(1056812697);
                            AlertDialogKt.c(str6, function0, composer2, 0);
                            composer2.l();
                        } else {
                            if (iOrdinal != 1) {
                                throw au.com.woolworths.android.onesite.a.x(composer2, 1056809693);
                            }
                            composer2.o(1056823408);
                            AlertDialogKt.b(str6, function0, composer2, 0);
                            composer2.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), str4, str2, composerImplV, i10);
            j4 = j7;
            j5 = j6;
            modifier4 = modifier3;
            composerImpl = composerImplV;
            dismissButtonStyle3 = dismissButtonStyle2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.wx.component.dialog.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    this.d.a(onDismissRequest, confirmButtonText, onConfirmButtonClick, dismissButtonText, onDismissButtonClick, modifier4, str4, str2, dismissButtonStyle3, j4, j5, (Composer) obj, iA, i2);
                    return Unit.f24250a;
                }
            };
        }
    }

    public final void b(final Function0 onDismissRequest, final String confirmButtonText, final Function0 onConfirmButtonClick, Modifier modifier, String str, final String str2, long j, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str3;
        int i4;
        int i5;
        Modifier modifier3;
        long jA;
        long jC;
        final Modifier modifier4;
        final String str4;
        final long j3;
        ComposerImpl composerImpl;
        final long j4;
        Intrinsics.h(onDismissRequest, "onDismissRequest");
        Intrinsics.h(confirmButtonText, "confirmButtonText");
        Intrinsics.h(onConfirmButtonClick, "onConfirmButtonClick");
        ComposerImpl composerImplV = composer.v(937165708);
        int i6 = i | (composerImplV.I(onDismissRequest) ? 4 : 2) | (composerImplV.n(confirmButtonText) ? 32 : 16) | (composerImplV.I(onConfirmButtonClick) ? 256 : 128);
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 = i6 | 3072;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i6 | (composerImplV.n(modifier2) ? 2048 : 1024);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i4 = i3 | 24576;
            str3 = str;
        } else {
            str3 = str;
            i4 = i3 | (composerImplV.n(str3) ? 16384 : 8192);
        }
        int i9 = i4 | (composerImplV.n(str2) ? 131072 : 65536) | 39321600;
        if ((38347923 & i9) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            j3 = j;
            str4 = str3;
            composerImpl = composerImplV;
            j4 = j2;
            modifier4 = modifier2;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                if (i7 != 0) {
                    modifier2 = Modifier.Companion.d;
                }
                if (i8 != 0) {
                    str3 = null;
                }
                i5 = i9 & (-264241153);
                modifier3 = modifier2;
                jA = WxTheme.a(composerImplV).a();
                jC = WxTheme.a(composerImplV).c();
            } else {
                composerImplV.j();
                i5 = i9 & (-264241153);
                modifier3 = modifier2;
                jA = j;
                jC = j2;
            }
            String str5 = str3;
            composerImplV.W();
            int i10 = i5 << 6;
            AlertDialogKt.a(jA, jC, onDismissRequest, ComposableLambdaKt.c(-933866474, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.wx.component.dialog.AlertDialog$ConfirmButtonOnly$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        AlertDialogKt.c(confirmButtonText, onConfirmButtonClick, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), modifier3, null, str5, str2, composerImplV, ((i5 << 3) & 57344) | (i10 & 896) | 199680 | (3670016 & i10) | (i10 & 29360128));
            modifier4 = modifier3;
            str4 = str5;
            j3 = jA;
            composerImpl = composerImplV;
            j4 = jC;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(onDismissRequest, confirmButtonText, onConfirmButtonClick, modifier4, str4, str2, j3, j4, i, i2) { // from class: au.com.woolworths.design.wx.component.dialog.b
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ String f;
                public final /* synthetic */ Function0 g;
                public final /* synthetic */ Modifier h;
                public final /* synthetic */ String i;
                public final /* synthetic */ String j;
                public final /* synthetic */ long k;
                public final /* synthetic */ long l;
                public final /* synthetic */ int m;

                {
                    this.m = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.d.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, RecomposeScopeImplKt.a(1), this.m);
                    return Unit.f24250a;
                }
            };
        }
    }
}
