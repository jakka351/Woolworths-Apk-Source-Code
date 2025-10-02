package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.product.models.InStoreLocationType;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductLocationInfoKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9280a;

        static {
            int[] iArr = new int[InStoreLocationType.values().length];
            try {
                iArr[InStoreLocationType.UNAVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f9280a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(au.com.woolworths.product.models.ProductCard r32, androidx.compose.ui.Modifier r33, boolean r34, kotlin.jvm.functions.Function0 r35, kotlin.jvm.functions.Function0 r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.composeui.ProductLocationInfoKt.a(au.com.woolworths.product.models.ProductCard, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final long b(ProductCard productCard, boolean z, Composer composer) {
        long j;
        composer.o(-1392237734);
        InstoreDetailsData inStoreDetails = productCard.getInStoreDetails();
        InStoreLocationType locationType = inStoreDetails != null ? inStoreDetails.getLocationType() : null;
        if ((locationType == null ? -1 : WhenMappings.f9280a[locationType.ordinal()]) == 1) {
            composer.o(2089340736);
            j = CoreTheme.b(composer).e.c.b;
            composer.l();
        } else {
            composer.o(345075977);
            if (z) {
                composer.o(2089343553);
                j = CoreTheme.b(composer).f4782a.d.b.f4798a;
            } else {
                composer.o(2089345024);
                j = CoreTheme.b(composer).e.c.d;
            }
            composer.l();
            composer.l();
        }
        composer.l();
        return j;
    }
}
