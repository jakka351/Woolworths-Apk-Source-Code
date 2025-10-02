package au.com.woolworths.shop.aem.components.model.title;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/title/TitleSectionType;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "TERTIARY", "NOT_SET", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TitleSectionType {

    @DefaultValue
    @SerializedName("NOT_SET")
    public static final TitleSectionType NOT_SET;

    @SerializedName("PRIMARY")
    public static final TitleSectionType PRIMARY;

    @SerializedName("SECONDARY")
    public static final TitleSectionType SECONDARY;

    @SerializedName("TERTIARY")
    public static final TitleSectionType TERTIARY;
    public static final /* synthetic */ TitleSectionType[] d;
    public static final /* synthetic */ EnumEntries e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10184a;

        static {
            int[] iArr = new int[TitleSectionType.values().length];
            try {
                iArr[TitleSectionType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TitleSectionType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TitleSectionType.TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TitleSectionType.NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10184a = iArr;
        }
    }

    static {
        TitleSectionType titleSectionType = new TitleSectionType("PRIMARY", 0);
        PRIMARY = titleSectionType;
        TitleSectionType titleSectionType2 = new TitleSectionType("SECONDARY", 1);
        SECONDARY = titleSectionType2;
        TitleSectionType titleSectionType3 = new TitleSectionType("TERTIARY", 2);
        TERTIARY = titleSectionType3;
        TitleSectionType titleSectionType4 = new TitleSectionType("NOT_SET", 3);
        NOT_SET = titleSectionType4;
        TitleSectionType[] titleSectionTypeArr = {titleSectionType, titleSectionType2, titleSectionType3, titleSectionType4};
        d = titleSectionTypeArr;
        e = EnumEntriesKt.a(titleSectionTypeArr);
    }

    private TitleSectionType(String str, int i) {
    }

    public static TitleSectionType valueOf(String str) {
        return (TitleSectionType) Enum.valueOf(TitleSectionType.class, str);
    }

    public static TitleSectionType[] values() {
        return (TitleSectionType[]) d.clone();
    }
}
