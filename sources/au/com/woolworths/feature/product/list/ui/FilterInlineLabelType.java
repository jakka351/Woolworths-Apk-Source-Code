package au.com.woolworths.feature.product.list.ui;

import au.com.woolworths.base.shopapp.customviews.InlineLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/ui/FilterInlineLabelType;", "Lau/com/woolworths/base/shopapp/customviews/InlineLabelType;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FilterInlineLabelType implements InlineLabelType {
    public static final /* synthetic */ FilterInlineLabelType[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        FilterInlineLabelType[] filterInlineLabelTypeArr = {new FilterInlineLabelType() { // from class: au.com.woolworths.feature.product.list.ui.FilterInlineLabelType.FILTER_COUNT
            @Override // au.com.woolworths.android.onesite.common.RoundedBackgroundSpan.SpanType
            public final int a() {
                return R.style.FilterCountSpan;
            }
        }};
        d = filterInlineLabelTypeArr;
        e = EnumEntriesKt.a(filterInlineLabelTypeArr);
    }

    public static FilterInlineLabelType valueOf(String str) {
        return (FilterInlineLabelType) Enum.valueOf(FilterInlineLabelType.class, str);
    }

    public static FilterInlineLabelType[] values() {
        return (FilterInlineLabelType[]) d.clone();
    }
}
