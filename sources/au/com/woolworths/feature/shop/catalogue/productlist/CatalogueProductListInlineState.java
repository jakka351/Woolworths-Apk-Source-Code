package au.com.woolworths.feature.shop.catalogue.productlist;

import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListInlineState;", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CatalogueProductListInlineState implements InlineErrorCause {
    public static final CatalogueProductListInlineState e;
    public static final CatalogueProductListInlineState f;
    public static final CatalogueProductListInlineState g;
    public static final /* synthetic */ CatalogueProductListInlineState[] h;
    public static final /* synthetic */ EnumEntries i;
    public PlainText d;

    static {
        CatalogueProductListInlineState catalogueProductListInlineState = new CatalogueProductListInlineState() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInlineState.UNKNOWN
            public final InlineErrorType j = InlineErrorType.f;

            @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
            /* renamed from: getErrorType, reason: from getter */
            public final InlineErrorType getJ() {
                return this.j;
            }
        };
        e = catalogueProductListInlineState;
        CatalogueProductListInlineState catalogueProductListInlineState2 = new CatalogueProductListInlineState() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInlineState.CURRENT_CATALOGUE
            public final InlineErrorType j = InlineErrorType.f;

            @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
            /* renamed from: getErrorType, reason: from getter */
            public final InlineErrorType getJ() {
                return this.j;
            }
        };
        f = catalogueProductListInlineState2;
        CatalogueProductListInlineState catalogueProductListInlineState3 = new CatalogueProductListInlineState() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInlineState.SNEAK_PEEK_CATALOGUE
            public final InlineErrorType j = InlineErrorType.g;

            @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
            /* renamed from: getErrorType, reason: from getter */
            public final InlineErrorType getJ() {
                return this.j;
            }
        };
        g = catalogueProductListInlineState3;
        CatalogueProductListInlineState[] catalogueProductListInlineStateArr = {catalogueProductListInlineState, catalogueProductListInlineState2, catalogueProductListInlineState3};
        h = catalogueProductListInlineStateArr;
        i = EnumEntriesKt.a(catalogueProductListInlineStateArr);
    }

    public static CatalogueProductListInlineState valueOf(String str) {
        return (CatalogueProductListInlineState) Enum.valueOf(CatalogueProductListInlineState.class, str);
    }

    public static CatalogueProductListInlineState[] values() {
        return (CatalogueProductListInlineState[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    public final Text getMessageText() {
        return this.d;
    }
}
