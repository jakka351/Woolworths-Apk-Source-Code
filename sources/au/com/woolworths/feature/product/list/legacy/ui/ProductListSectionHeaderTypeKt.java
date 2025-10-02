package au.com.woolworths.feature.product.list.legacy.ui;

import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderTypeApiData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListSectionHeaderTypeKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5386a;

        static {
            int[] iArr = new int[ListSectionHeaderTypeApiData.values().length];
            try {
                iArr[ListSectionHeaderTypeApiData.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListSectionHeaderTypeApiData.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5386a = iArr;
        }
    }
}
