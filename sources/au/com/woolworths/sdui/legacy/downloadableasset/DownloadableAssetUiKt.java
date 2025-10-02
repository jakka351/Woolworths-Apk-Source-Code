package au.com.woolworths.sdui.legacy.downloadableasset;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetFit;
import au.com.woolworths.android.onesite.data.DownloadableAssetType;
import au.com.woolworths.feature.product.list.d0;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import com.medallia.digital.mobilesdk.q2;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DownloadableAssetUiKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10003a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[DownloadableAssetFit.values().length];
            try {
                iArr[DownloadableAssetFit.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10003a = iArr;
            int[] iArr2 = new int[DownloadableAssetType.values().length];
            try {
                iArr2[DownloadableAssetType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[DownloadableAssetType.LOTTIE_ANIMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr2;
        }
    }

    public static final void a(DownloadableAsset downloadableAsset, ContentScale contentScale, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(697396127);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(downloadableAsset) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(contentScale) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(true) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.p(true) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int i3 = i2 >> 3;
            Lottie.f10004a.b(downloadableAsset.getAssetUrl(), contentScale, modifier, composerImplV, (i2 & 112) | 196608 | (i3 & 896) | (i3 & 7168) | ((i2 << 6) & 57344));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 10, downloadableAsset, contentScale, modifier, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(au.com.woolworths.android.onesite.data.DownloadableAsset r19, androidx.compose.ui.Modifier r20, boolean r21, boolean r22, boolean r23, androidx.compose.ui.graphics.painter.Painter r24, java.util.List r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.sdui.legacy.downloadableasset.DownloadableAssetUiKt.b(au.com.woolworths.android.onesite.data.DownloadableAsset, androidx.compose.ui.Modifier, boolean, boolean, boolean, androidx.compose.ui.graphics.painter.Painter, java.util.List, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(DownloadableAsset downloadableAsset, ContentScale contentScale, String str, Painter painter, Modifier modifier, Composer composer, int i) {
        DownloadableAsset downloadableAsset2;
        int i2;
        ContentScale contentScale2;
        Object next;
        VectorPainter vectorPainter;
        boolean z;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1498980292);
        if ((i & 6) == 0) {
            downloadableAsset2 = downloadableAsset;
            i2 = (composerImplV.I(downloadableAsset2) ? 4 : 2) | i;
        } else {
            downloadableAsset2 = downloadableAsset;
            i2 = i;
        }
        if ((i & 48) == 0) {
            contentScale2 = contentScale;
            i2 |= composerImplV.n(contentScale2) ? 32 : 16;
        } else {
            contentScale2 = contentScale;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(painter) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        EmptyList emptyList = EmptyList.d;
        if (i3 == 0) {
            i2 |= composerImplV.I(emptyList) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            String assetUrl = downloadableAsset2.getAssetUrl();
            int i4 = i2 >> 9;
            composerImplV.o(-2021606340);
            composerImplV.o(-40421119);
            composerImplV.o(-1438464387);
            String lowerCase = assetUrl.toLowerCase(Locale.ROOT);
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            Iterator<E> it = emptyList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String lowerCase2 = ((ImageVector) next).f1813a.toLowerCase(Locale.ROOT);
                Intrinsics.g(lowerCase2, "toLowerCase(...)");
                if (lowerCase.equals(lowerCase2)) {
                    break;
                }
                if (StringsKt.o(lowerCase, q2.c + lowerCase2 + ".", false)) {
                    break;
                }
            }
            ImageVector imageVector = (ImageVector) next;
            composerImplV.o(-1438457205);
            Object objE = imageVector == null ? null : VectorPainterKt.e(imageVector, composerImplV);
            composerImplV.V(false);
            composerImplV.V(false);
            if (objE == null) {
                z = false;
                vectorPainter = null;
            } else {
                composerImplV.o(5004770);
                boolean zN = composerImplV.n(assetUrl);
                Object objG = composerImplV.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    composerImplV.A(objE);
                } else {
                    objE = objG;
                }
                vectorPainter = (Painter) objE;
                z = false;
                composerImplV.V(false);
            }
            composerImplV.V(z);
            composerImplV.V(z);
            ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
            builder.c = downloadableAsset.getAssetUrl();
            int i5 = i2 >> 3;
            composerImpl = composerImplV;
            SingletonAsyncImageKt.b(builder.a(), str, modifier, vectorPainter == null ? painter : vectorPainter, painter, painter, null, null, null, null, contentScale2, null, composerImpl, (i5 & 112) | (i4 & 896) | (57344 & (i2 << 3)) | ((i2 << 6) & 458752), i5 & 14, 31680);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(downloadableAsset, contentScale, str, painter, modifier, i, 19);
        }
    }
}
