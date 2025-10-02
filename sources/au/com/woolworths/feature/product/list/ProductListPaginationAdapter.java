package au.com.woolworths.feature.product.list;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListPaginationAdapter;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListPaginationAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final ProductListInteractor f5261a;
    public final FeatureToggleManager b;
    public final RepositoryManager c;
    public Integer d;
    public final LinkedHashMap e;
    public final Lazy f;

    public ProductListPaginationAdapter(ProductListInteractor productListInteractor, FeatureToggleManager featureToggleManager, RepositoryManager repositoryManager) {
        Intrinsics.h(productListInteractor, "productListInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(repositoryManager, "repositoryManager");
        this.f5261a = productListInteractor;
        this.b = featureToggleManager;
        this.c = repositoryManager;
        this.e = new LinkedHashMap();
        this.f = LazyKt.b(new i(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x02b1 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:14:0x0037, B:150:0x02ad, B:152:0x02b1, B:154:0x02b8, B:156:0x02c1, B:160:0x02cb, B:162:0x02d1, B:164:0x02dc, B:166:0x02e4, B:167:0x02e8, B:158:0x02c7, B:19:0x0041, B:143:0x0280, B:22:0x0048, B:136:0x0240, B:25:0x004f, B:129:0x0225, B:28:0x0056, B:122:0x020e, B:31:0x005d, B:115:0x01ed, B:34:0x0064, B:108:0x01cd, B:37:0x006b, B:100:0x0194, B:40:0x0072, B:91:0x0179, B:43:0x0079, B:84:0x015a, B:46:0x0080, B:76:0x013c, B:49:0x0087, B:69:0x00fd, B:52:0x008e, B:62:0x00ca, B:55:0x0097, B:58:0x009f, B:63:0x00ce, B:65:0x00d2, B:70:0x0101, B:72:0x0105, B:77:0x0140, B:80:0x0147, B:85:0x015e, B:87:0x0162, B:92:0x017d, B:94:0x0181, B:96:0x0187, B:102:0x019d, B:104:0x01a1, B:109:0x01d1, B:111:0x01d5, B:116:0x01f1, B:118:0x01f5, B:123:0x0212, B:125:0x0216, B:130:0x0229, B:132:0x022d, B:137:0x0244, B:139:0x0248, B:144:0x0283, B:146:0x0288, B:169:0x02f0, B:170:0x02f5), top: B:173:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c1 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:14:0x0037, B:150:0x02ad, B:152:0x02b1, B:154:0x02b8, B:156:0x02c1, B:160:0x02cb, B:162:0x02d1, B:164:0x02dc, B:166:0x02e4, B:167:0x02e8, B:158:0x02c7, B:19:0x0041, B:143:0x0280, B:22:0x0048, B:136:0x0240, B:25:0x004f, B:129:0x0225, B:28:0x0056, B:122:0x020e, B:31:0x005d, B:115:0x01ed, B:34:0x0064, B:108:0x01cd, B:37:0x006b, B:100:0x0194, B:40:0x0072, B:91:0x0179, B:43:0x0079, B:84:0x015a, B:46:0x0080, B:76:0x013c, B:49:0x0087, B:69:0x00fd, B:52:0x008e, B:62:0x00ca, B:55:0x0097, B:58:0x009f, B:63:0x00ce, B:65:0x00d2, B:70:0x0101, B:72:0x0105, B:77:0x0140, B:80:0x0147, B:85:0x015e, B:87:0x0162, B:92:0x017d, B:94:0x0181, B:96:0x0187, B:102:0x019d, B:104:0x01a1, B:109:0x01d1, B:111:0x01d5, B:116:0x01f1, B:118:0x01f5, B:123:0x0212, B:125:0x0216, B:130:0x0229, B:132:0x022d, B:137:0x0244, B:139:0x0248, B:144:0x0283, B:146:0x0288, B:169:0x02f0, B:170:0x02f5), top: B:173:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c7 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:14:0x0037, B:150:0x02ad, B:152:0x02b1, B:154:0x02b8, B:156:0x02c1, B:160:0x02cb, B:162:0x02d1, B:164:0x02dc, B:166:0x02e4, B:167:0x02e8, B:158:0x02c7, B:19:0x0041, B:143:0x0280, B:22:0x0048, B:136:0x0240, B:25:0x004f, B:129:0x0225, B:28:0x0056, B:122:0x020e, B:31:0x005d, B:115:0x01ed, B:34:0x0064, B:108:0x01cd, B:37:0x006b, B:100:0x0194, B:40:0x0072, B:91:0x0179, B:43:0x0079, B:84:0x015a, B:46:0x0080, B:76:0x013c, B:49:0x0087, B:69:0x00fd, B:52:0x008e, B:62:0x00ca, B:55:0x0097, B:58:0x009f, B:63:0x00ce, B:65:0x00d2, B:70:0x0101, B:72:0x0105, B:77:0x0140, B:80:0x0147, B:85:0x015e, B:87:0x0162, B:92:0x017d, B:94:0x0181, B:96:0x0187, B:102:0x019d, B:104:0x01a1, B:109:0x01d1, B:111:0x01d5, B:116:0x01f1, B:118:0x01f5, B:123:0x0212, B:125:0x0216, B:130:0x0229, B:132:0x022d, B:137:0x0244, B:139:0x0248, B:144:0x0283, B:146:0x0288, B:169:0x02f0, B:170:0x02f5), top: B:173:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02cb A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:14:0x0037, B:150:0x02ad, B:152:0x02b1, B:154:0x02b8, B:156:0x02c1, B:160:0x02cb, B:162:0x02d1, B:164:0x02dc, B:166:0x02e4, B:167:0x02e8, B:158:0x02c7, B:19:0x0041, B:143:0x0280, B:22:0x0048, B:136:0x0240, B:25:0x004f, B:129:0x0225, B:28:0x0056, B:122:0x020e, B:31:0x005d, B:115:0x01ed, B:34:0x0064, B:108:0x01cd, B:37:0x006b, B:100:0x0194, B:40:0x0072, B:91:0x0179, B:43:0x0079, B:84:0x015a, B:46:0x0080, B:76:0x013c, B:49:0x0087, B:69:0x00fd, B:52:0x008e, B:62:0x00ca, B:55:0x0097, B:58:0x009f, B:63:0x00ce, B:65:0x00d2, B:70:0x0101, B:72:0x0105, B:77:0x0140, B:80:0x0147, B:85:0x015e, B:87:0x0162, B:92:0x017d, B:94:0x0181, B:96:0x0187, B:102:0x019d, B:104:0x01a1, B:109:0x01d1, B:111:0x01d5, B:116:0x01f1, B:118:0x01f5, B:123:0x0212, B:125:0x0216, B:130:0x0229, B:132:0x022d, B:137:0x0244, B:139:0x0248, B:144:0x0283, B:146:0x0288, B:169:0x02f0, B:170:0x02f5), top: B:173:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e4 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:14:0x0037, B:150:0x02ad, B:152:0x02b1, B:154:0x02b8, B:156:0x02c1, B:160:0x02cb, B:162:0x02d1, B:164:0x02dc, B:166:0x02e4, B:167:0x02e8, B:158:0x02c7, B:19:0x0041, B:143:0x0280, B:22:0x0048, B:136:0x0240, B:25:0x004f, B:129:0x0225, B:28:0x0056, B:122:0x020e, B:31:0x005d, B:115:0x01ed, B:34:0x0064, B:108:0x01cd, B:37:0x006b, B:100:0x0194, B:40:0x0072, B:91:0x0179, B:43:0x0079, B:84:0x015a, B:46:0x0080, B:76:0x013c, B:49:0x0087, B:69:0x00fd, B:52:0x008e, B:62:0x00ca, B:55:0x0097, B:58:0x009f, B:63:0x00ce, B:65:0x00d2, B:70:0x0101, B:72:0x0105, B:77:0x0140, B:80:0x0147, B:85:0x015e, B:87:0x0162, B:92:0x017d, B:94:0x0181, B:96:0x0187, B:102:0x019d, B:104:0x01a1, B:109:0x01d1, B:111:0x01d5, B:116:0x01f1, B:118:0x01f5, B:123:0x0212, B:125:0x0216, B:130:0x0229, B:132:0x022d, B:137:0x0244, B:139:0x0248, B:144:0x0283, B:146:0x0288, B:169:0x02f0, B:170:0x02f5), top: B:173:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Integer r18, au.com.woolworths.android.onesite.navigation.Activities.ProductList.Extras r19, java.lang.String r20, java.util.List r21, java.util.Map r22, java.lang.String r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListPaginationAdapter.a(java.lang.Integer, au.com.woolworths.android.onesite.navigation.Activities$ProductList$Extras, java.lang.String, java.util.List, java.util.Map, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
