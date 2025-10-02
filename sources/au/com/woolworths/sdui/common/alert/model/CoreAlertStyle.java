package au.com.woolworths.sdui.common.alert.model;

import au.com.woolworths.design.core.ui.component.stable.alert.AlertStyle;
import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/sdui/common/alert/model/CoreAlertStyle;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "SUCCESS", "WARNING", "ERROR", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreAlertStyle {

    @SerializedName("ERROR")
    public static final CoreAlertStyle ERROR;

    @DefaultValue
    @SerializedName("INFO")
    public static final CoreAlertStyle INFO;

    @SerializedName("SUCCESS")
    public static final CoreAlertStyle SUCCESS;

    @SerializedName("WARNING")
    public static final CoreAlertStyle WARNING;
    public static final /* synthetic */ CoreAlertStyle[] d;
    public static final /* synthetic */ EnumEntries e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9987a;

        static {
            int[] iArr = new int[CoreAlertStyle.values().length];
            try {
                iArr[CoreAlertStyle.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoreAlertStyle.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoreAlertStyle.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoreAlertStyle.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9987a = iArr;
        }
    }

    static {
        CoreAlertStyle coreAlertStyle = new CoreAlertStyle("INFO", 0);
        INFO = coreAlertStyle;
        CoreAlertStyle coreAlertStyle2 = new CoreAlertStyle("SUCCESS", 1);
        SUCCESS = coreAlertStyle2;
        CoreAlertStyle coreAlertStyle3 = new CoreAlertStyle("WARNING", 2);
        WARNING = coreAlertStyle3;
        CoreAlertStyle coreAlertStyle4 = new CoreAlertStyle("ERROR", 3);
        ERROR = coreAlertStyle4;
        CoreAlertStyle[] coreAlertStyleArr = {coreAlertStyle, coreAlertStyle2, coreAlertStyle3, coreAlertStyle4};
        d = coreAlertStyleArr;
        e = EnumEntriesKt.a(coreAlertStyleArr);
    }

    private CoreAlertStyle(String str, int i) {
    }

    public static CoreAlertStyle valueOf(String str) {
        return (CoreAlertStyle) Enum.valueOf(CoreAlertStyle.class, str);
    }

    public static CoreAlertStyle[] values() {
        return (CoreAlertStyle[]) d.clone();
    }

    public final AlertStyle a() {
        int i = WhenMappings.f9987a[ordinal()];
        if (i == 1) {
            return AlertStyle.d;
        }
        if (i == 2) {
            return AlertStyle.e;
        }
        if (i == 3) {
            return AlertStyle.f;
        }
        if (i == 4) {
            return AlertStyle.g;
        }
        throw new NoWhenBranchMatchedException();
    }
}
