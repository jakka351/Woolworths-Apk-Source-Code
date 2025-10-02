package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderTypeApiData;
import au.com.woolworths.shop.graphql.type.ListSectionHeaderTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/base/shopapp/modules/listsectionheader/ListSectionHeaderTypeApiData;", "Lau/com/woolworths/shop/graphql/type/ListSectionHeaderTypes;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ListSectionHeaderTypesExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ListSectionHeaderTypes.values().length];
            try {
                ListSectionHeaderTypes.Companion companion = ListSectionHeaderTypes.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ListSectionHeaderTypes.Companion companion2 = ListSectionHeaderTypes.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ListSectionHeaderTypeApiData toUiModel(@NotNull ListSectionHeaderTypes listSectionHeaderTypes) {
        Intrinsics.h(listSectionHeaderTypes, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[listSectionHeaderTypes.ordinal()];
        return i != 1 ? i != 2 ? ListSectionHeaderTypeApiData.d : ListSectionHeaderTypeApiData.SECONDARY : ListSectionHeaderTypeApiData.PRIMARY;
    }
}
