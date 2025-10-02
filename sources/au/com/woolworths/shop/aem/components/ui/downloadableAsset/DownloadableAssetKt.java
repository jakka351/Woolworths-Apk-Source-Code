package au.com.woolworths.shop.aem.components.ui.downloadableAsset;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.SizeKt;
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
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.shop.aem.components.model.downloadableAsset.AssetFit;
import au.com.woolworths.shop.aem.components.model.downloadableAsset.AssetType;
import au.com.woolworths.shop.aem.components.model.downloadableAsset.DownloadableAssetData;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.medallia.digital.mobilesdk.q2;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DownloadableAssetKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10217a;

        static {
            int[] iArr = new int[AssetFit.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10217a = iArr;
            int[] iArr2 = new int[AssetType.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AssetType assetType = AssetType.d;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(DownloadableAssetData downloadableAssetData, ContentScale contentScale, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(875352814);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(downloadableAssetData) ? 4 : 2) | i;
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
            Lottie.f10218a.b(downloadableAssetData.c, contentScale, modifier, composerImplV, (i2 & 112) | 196608 | (i3 & 896) | (i3 & 7168) | ((i2 << 6) & 57344));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 13, downloadableAssetData, contentScale, modifier, false);
        }
    }

    public static final void b(DownloadableAssetData downloadableAssetData, Modifier modifier, boolean z, boolean z2, Painter painter, List list, Composer composer, int i, int i2) {
        Painter painter2;
        int i3;
        boolean z3;
        Painter painter3;
        Painter painter4;
        List list2;
        boolean z4;
        boolean z5;
        int i4 = downloadableAssetData.d;
        int i5 = downloadableAssetData.e;
        ComposerImpl composerImplV = composer.v(-587371958);
        int i6 = i | (composerImplV.n(downloadableAssetData) ? 4 : 2) | (composerImplV.n(modifier) ? 32 : 16);
        int i7 = i6 | 3456;
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 = i6 | 28032;
            painter2 = painter;
        } else {
            painter2 = painter;
            i3 = i7 | (composerImplV.I(painter2) ? 16384 : 8192);
        }
        int i9 = i3 | 196608;
        if ((74899 & i9) == 74898 && composerImplV.c()) {
            composerImplV.j();
            z5 = z2;
            list2 = list;
            painter4 = painter2;
            z4 = z;
        } else {
            if (i8 != 0) {
                painter2 = null;
            }
            Painter painter5 = painter2;
            AssetFit assetFit = downloadableAssetData.f;
            Pair pair = (assetFit == null ? -1 : WhenMappings.f10217a[assetFit.ordinal()]) == 1 ? new Pair(SizeKt.u(SizeKt.g(modifier, i5), i4), ContentScale.Companion.b) : new Pair(AspectRatioKt.a(modifier, i4 / i5), ContentScale.Companion.d);
            Modifier modifier2 = (Modifier) pair.d;
            ContentScale contentScale = (ContentScale) pair.e;
            int iOrdinal = downloadableAssetData.b.ordinal();
            if (iOrdinal == 0) {
                z3 = true;
                painter3 = painter5;
                composerImplV.o(-1823702222);
                a(downloadableAssetData, contentScale, modifier2, composerImplV, (i9 & 14) | 27648);
                composerImplV.V(false);
            } else if (iOrdinal != 1) {
                composerImplV.o(-699949566);
                if (painter5 != null) {
                    ImageKt.a(painter5, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 124);
                }
                composerImplV.V(false);
                z3 = true;
                painter3 = painter5;
            } else {
                composerImplV.o(-700527282);
                z3 = true;
                c(downloadableAssetData, contentScale, downloadableAssetData.getAltText(), painter5, modifier2, composerImplV, ((i9 >> 3) & 7168) | (i9 & 14) | 24576);
                painter3 = painter5;
                composerImplV.V(false);
            }
            painter4 = painter3;
            list2 = EmptyList.d;
            z4 = z3;
            z5 = z4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(downloadableAssetData, modifier, z4, z5, painter4, list2, i, i2);
        }
    }

    public static final void c(DownloadableAssetData downloadableAssetData, ContentScale contentScale, String str, Painter painter, Modifier modifier, Composer composer, int i) {
        int i2;
        ContentScale contentScale2;
        Object next;
        VectorPainter vectorPainter;
        boolean z;
        ComposerImpl composerImpl;
        String str2 = downloadableAssetData.c;
        ComposerImpl composerImplV = composer.v(-1868038799);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(downloadableAssetData) ? 4 : 2) | i;
        } else {
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
            int i4 = i2 >> 9;
            composerImplV.o(-2021606340);
            composerImplV.o(-40421119);
            composerImplV.o(-1438464387);
            String lowerCase = str2.toLowerCase(Locale.ROOT);
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
                boolean zN = composerImplV.n(str2);
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
            builder.c = str2;
            int i5 = i2 >> 3;
            composerImpl = composerImplV;
            SingletonAsyncImageKt.b(builder.a(), str, modifier, vectorPainter == null ? painter : vectorPainter, painter, painter, null, null, null, null, contentScale2, null, composerImpl, (i5 & 112) | (i4 & 896) | (57344 & (i2 << 3)) | ((i2 << 6) & 458752), i5 & 14, 31680);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(downloadableAssetData, contentScale, str, painter, modifier, i, 20);
        }
    }
}
