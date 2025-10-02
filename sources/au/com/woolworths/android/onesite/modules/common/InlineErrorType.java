package au.com.woolworths.android.onesite.modules.common;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/common/InlineErrorType;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InlineErrorType {
    public static final InlineErrorType f;
    public static final InlineErrorType g;
    public static final InlineErrorType h;
    public static final InlineErrorType i;
    public static final InlineErrorType j;
    public static final /* synthetic */ InlineErrorType[] k;
    public static final /* synthetic */ EnumEntries l;
    public final int d;
    public final int e;

    static {
        InlineErrorType inlineErrorType = new InlineErrorType(0, R.attr.inlineInfoStyle, R.string.banner_info_content_description, "INFO");
        f = inlineErrorType;
        InlineErrorType inlineErrorType2 = new InlineErrorType(1, R.attr.inlineWarningStyle, R.string.banner_warning_content_description, "WARNING");
        g = inlineErrorType2;
        InlineErrorType inlineErrorType3 = new InlineErrorType(2, R.attr.inlineErrorStyle, R.string.banner_alert_content_description, "ERROR");
        h = inlineErrorType3;
        InlineErrorType inlineErrorType4 = new InlineErrorType(3, R.attr.inlineRewardsStyle, R.string.banner_rewards_content_description, "REWARDS");
        i = inlineErrorType4;
        InlineErrorType inlineErrorType5 = new InlineErrorType(4, R.attr.inlinePrimaryDarkStyle, R.string.banner_primary_dark_content_description, "PRIMARY_DARK");
        j = inlineErrorType5;
        InlineErrorType[] inlineErrorTypeArr = {inlineErrorType, inlineErrorType2, inlineErrorType3, inlineErrorType4, inlineErrorType5};
        k = inlineErrorTypeArr;
        l = EnumEntriesKt.a(inlineErrorTypeArr);
    }

    public InlineErrorType(int i2, int i3, int i4, String str) {
        this.d = i3;
        this.e = i4;
    }

    public static InlineErrorType valueOf(String str) {
        return (InlineErrorType) Enum.valueOf(InlineErrorType.class, str);
    }

    public static InlineErrorType[] values() {
        return (InlineErrorType[]) k.clone();
    }

    public final int a(int i2, Context context) throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(this.d, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValue.resourceId, au.com.woolworths.android.onesite.base.R.styleable.b);
        Intrinsics.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
        int color = typedArrayObtainStyledAttributes.getColor(i2, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public final int b(int i2, Context context) throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(this.d, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValue.resourceId, au.com.woolworths.android.onesite.base.R.styleable.b);
        Intrinsics.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
