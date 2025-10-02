package au.com.woolworths.design.core.ui.component.experimental.tag;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.icon.IconKeyMapperKt;
import coil3.compose.SingletonAsyncImageKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TagKt {
    public static final void a(String text, final TagColorPalette tagColorPalette, Modifier modifier, TagSpec.Size size, final TagSpec.Image image, TagSpec.IconPosition iconPosition, Composer composer, int i) {
        int i2;
        TagSpec.IconPosition iconPosition2;
        Intrinsics.h(text, "text");
        ComposerImpl composerImplV = composer.v(-1460476780);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(tagColorPalette) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.r(size == null ? -1 : size.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerImplV.n(image) : composerImplV.I(image) ? 16384 : 8192;
        }
        int i3 = i2 | 1769472;
        if ((599187 & i3) == 599186 && composerImplV.c()) {
            composerImplV.j();
            iconPosition2 = iconPosition;
        } else {
            TagSpec.IconPosition iconPosition3 = TagSpec.IconPosition.d;
            d(text, null, tagColorPalette.b, tagColorPalette.c, tagColorPalette.f4731a, size, modifier, tagColorPalette.d, iconPosition3, ComposableLambdaKt.c(1741569754, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.experimental.tag.TagKt$Tag$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TagSpec.Image image2 = image;
                        boolean z = image2 instanceof TagSpec.Image.LocalAsset;
                        Modifier.Companion companion = Modifier.Companion.d;
                        if (z) {
                            composer2.o(-100256469);
                            ImageVector imageVectorA = IconKeyMapperKt.a(CoreTheme.e(composer2), ((TagSpec.Image.LocalAsset) image2).f4732a);
                            if (imageVectorA != null) {
                                IconKt.b(imageVectorA, null, SizeKt.q(companion, 16), tagColorPalette.f4731a, composer2, 432, 0);
                            }
                            composer2.l();
                        } else if (image2 instanceof TagSpec.Image.RemoteAsset) {
                            composer2.o(-99885151);
                            SingletonAsyncImageKt.a(((TagSpec.Image.RemoteAsset) image2).f4733a, null, SizeKt.q(companion, 16), null, null, composer2, 432, 2040);
                            composer2.l();
                        } else {
                            if (image2 != null) {
                                throw au.com.woolworths.android.onesite.a.x(composer2, -1388710827);
                            }
                            composer2.o(-99702778);
                            composer2.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i3 & 14) | 805306368 | ((i3 >> 15) & 112) | ((i3 << 6) & 458752) | ((i3 << 12) & 3670016) | ((i3 << 9) & 234881024));
            iconPosition2 = iconPosition3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(text, tagColorPalette, modifier, size, image, iconPosition2, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r17, au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style r18, androidx.compose.ui.Modifier r19, au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Size r20, androidx.compose.ui.graphics.vector.ImageVector r21, au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.IconPosition r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.experimental.tag.TagKt.b(java.lang.String, au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec$Style, androidx.compose.ui.Modifier, au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec$Size, androidx.compose.ui.graphics.vector.ImageVector, au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec$IconPosition, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final java.lang.String r19, final java.lang.String r20, final long r21, final long r23, final long r25, final au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Size r27, final androidx.compose.ui.Modifier r28, boolean r29, final androidx.compose.ui.graphics.vector.ImageVector r30, final au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.IconPosition r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.experimental.tag.TagKt.c(java.lang.String, java.lang.String, long, long, long, au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec$Size, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.vector.ImageVector, au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec$IconPosition, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void d(final String str, final String str2, final long j, final long j2, final long j3, final TagSpec.Size size, final Modifier modifier, final boolean z, final TagSpec.IconPosition iconPosition, final Function2 function2, Composer composer, final int i) {
        String str3;
        int i2;
        String str4;
        Modifier modifier2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-320007479);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (composerImplV.n(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= composerImplV.n(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.s(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.s(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.s(j3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.r(size.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier2) ? 1048576 : 524288;
        } else {
            modifier2 = modifier;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.p(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.r(iconPosition == null ? -1 : iconPosition.ordinal()) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerImplV.I(function2) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final String str5 = str3;
            final String str6 = str4;
            composerImpl = composerImplV;
            SurfaceKt.b(modifier2, RoundedCornerShapeKt.b(size.f), j, 0L, z ? BorderStrokeKt.a(j2, 1) : null, null, ComposableLambdaKt.c(-11440123, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.experimental.tag.TagKt$TagImpl$3
                /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r19, java.lang.Object r20) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 374
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.experimental.tag.TagKt$TagImpl$3.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerImplV), composerImpl, 40);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.core.ui.component.experimental.tag.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    TagKt.d(str, str2, j, j2, j3, size, modifier, z, iconPosition, function2, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
