package au.com.woolworths.sdui.shop.dynamicsizecard;

import au.com.woolworths.graphql.DefaultValue;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/sdui/shop/dynamicsizecard/DefaultCardHeight;", "Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardHeight;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "MEDIUM", "LARGE", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DefaultCardHeight implements DynamicSizeCardHeight {

    @SerializedName("LARGE")
    @MappedName
    public static final DefaultCardHeight LARGE;

    @SerializedName("MEDIUM")
    @MappedName
    public static final DefaultCardHeight MEDIUM;

    @DefaultValue
    @SerializedName("SMALL")
    @MappedName
    public static final DefaultCardHeight SMALL;
    public static final /* synthetic */ DefaultCardHeight[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        DefaultCardHeight defaultCardHeight = new DefaultCardHeight() { // from class: au.com.woolworths.sdui.shop.dynamicsizecard.DefaultCardHeight.SMALL
            public final int f = R.string.dynamic_height_card_small_ratio;
            public final float g = 6.4f;

            @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardHeight
            /* renamed from: a, reason: from getter */
            public final int getF() {
                return this.f;
            }

            @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardHeight
            /* renamed from: getAspectRatio, reason: from getter */
            public final float getG() {
                return this.g;
            }
        };
        SMALL = defaultCardHeight;
        DefaultCardHeight defaultCardHeight2 = new DefaultCardHeight() { // from class: au.com.woolworths.sdui.shop.dynamicsizecard.DefaultCardHeight.MEDIUM
            public final int f = R.string.dynamic_height_card_medium_ratio;
            public final float g = 3.2f;

            @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardHeight
            /* renamed from: a, reason: from getter */
            public final int getF() {
                return this.f;
            }

            @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardHeight
            /* renamed from: getAspectRatio, reason: from getter */
            public final float getG() {
                return this.g;
            }
        };
        MEDIUM = defaultCardHeight2;
        DefaultCardHeight defaultCardHeight3 = new DefaultCardHeight() { // from class: au.com.woolworths.sdui.shop.dynamicsizecard.DefaultCardHeight.LARGE
            public final int f = R.string.dynamic_height_card_large_ratio;
            public final float g = 3.2f;

            @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardHeight
            /* renamed from: a, reason: from getter */
            public final int getF() {
                return this.f;
            }

            @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardHeight
            /* renamed from: getAspectRatio, reason: from getter */
            public final float getG() {
                return this.g;
            }
        };
        LARGE = defaultCardHeight3;
        DefaultCardHeight[] defaultCardHeightArr = {defaultCardHeight, defaultCardHeight2, defaultCardHeight3};
        d = defaultCardHeightArr;
        e = EnumEntriesKt.a(defaultCardHeightArr);
    }

    public /* synthetic */ DefaultCardHeight(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static DefaultCardHeight valueOf(String str) {
        return (DefaultCardHeight) Enum.valueOf(DefaultCardHeight.class, str);
    }

    public static DefaultCardHeight[] values() {
        return (DefaultCardHeight[]) d.clone();
    }

    private DefaultCardHeight(String str, int i) {
    }
}
