package au.com.woolworths.design.core.ui.component.stable.textbutton;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/textbutton/TextButtonSpec;", "", "Variant", "Size", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextButtonSpec {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/textbutton/TextButtonSpec$Size;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Size {
        public static final Size d;
        public static final Size e;
        public static final /* synthetic */ Size[] f;
        public static final /* synthetic */ EnumEntries g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Size.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Size size = Size.d;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        static {
            Size size = new Size("Medium", 0);
            d = size;
            Size size2 = new Size("Small", 1);
            e = size2;
            Size[] sizeArr = {size, size2};
            f = sizeArr;
            g = EnumEntriesKt.a(sizeArr);
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) f.clone();
        }

        public final ButtonSpec.Size a() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return ButtonSpec.Size.g;
            }
            if (iOrdinal == 1) {
                return ButtonSpec.Size.h;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/textbutton/TextButtonSpec$Variant;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Variant {
        public static final Variant d;
        public static final /* synthetic */ Variant[] e;
        public static final /* synthetic */ EnumEntries f;

        static {
            Variant variant = new Variant("Primary", 0);
            d = variant;
            Variant[] variantArr = {variant, new Variant("Destructive", 1)};
            e = variantArr;
            f = EnumEntriesKt.a(variantArr);
        }

        public static Variant valueOf(String str) {
            return (Variant) Enum.valueOf(Variant.class, str);
        }

        public static Variant[] values() {
            return (Variant[]) e.clone();
        }
    }
}
