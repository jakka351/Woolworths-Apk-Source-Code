package au.com.woolworths.feature.shop.catalogue.productlist.model;

import au.com.woolworths.product.models.ProductTileButtonType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"catalogue_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6949a;

        static {
            int[] iArr = new int[ProductTileButtonType.values().length];
            try {
                iArr[ProductTileButtonType.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductTileButtonType.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductTileButtonType.UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6949a = iArr;
        }
    }
}
