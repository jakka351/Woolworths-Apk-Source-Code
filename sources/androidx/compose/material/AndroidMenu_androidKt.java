package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AndroidMenu_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final PopupProperties f1237a = new PopupProperties(true, 14);

    /* JADX WARN: Removed duplicated region for block: B:102:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final boolean r21, final kotlin.jvm.functions.Function0 r22, androidx.compose.ui.Modifier r23, long r24, androidx.compose.foundation.ScrollState r26, androidx.compose.ui.window.PopupProperties r27, final androidx.compose.runtime.internal.ComposableLambdaImpl r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AndroidMenu_androidKt.a(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, long, androidx.compose.foundation.ScrollState, androidx.compose.ui.window.PopupProperties, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final Function0 function0, Modifier modifier, boolean z, PaddingValues paddingValues, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        final Modifier modifier2;
        final boolean z2;
        final PaddingValues paddingValues2;
        ComposerImpl composerImplV = composer.v(-1988562892);
        int i2 = (composerImplV.I(function0) ? 4 : 2) | i | 28080;
        if (composerImplV.z(i2 & 1, (74899 & i2) != 74898)) {
            PaddingValuesImpl paddingValuesImpl = MenuDefaults.f1297a;
            MenuKt.b(function0, paddingValuesImpl, composableLambdaImpl, composerImplV, i2 & 524286);
            modifier2 = Modifier.Companion.d;
            paddingValues2 = paddingValuesImpl;
            z2 = true;
        } else {
            composerImplV.j();
            modifier2 = modifier;
            z2 = z;
            paddingValues2 = paddingValues;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(modifier2, z2, paddingValues2, composableLambdaImpl, i) { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenuItem$1
                public final /* synthetic */ Modifier i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ PaddingValues k;
                public final /* synthetic */ ComposableLambdaImpl l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(196609);
                    AndroidMenu_androidKt.b(this.h, this.i, this.j, this.k, this.l, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
