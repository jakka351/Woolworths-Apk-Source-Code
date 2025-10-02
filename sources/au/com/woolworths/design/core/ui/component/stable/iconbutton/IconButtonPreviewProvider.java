package au.com.woolworths.design.core.ui.component.stable.iconbutton;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonSpec;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/iconbutton/IconButtonPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/design/core/ui/component/stable/iconbutton/IconButtonPreviewConfig;", "TestCase", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalCoreDesignApi
/* loaded from: classes3.dex */
public final class IconButtonPreviewProvider implements PreviewParameterProvider<IconButtonPreviewConfig> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/iconbutton/IconButtonPreviewProvider$TestCase;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonPreviewProvider$TestCase$1, reason: invalid class name */
        public static final class AnonymousClass1 implements Function2<Composer, Integer, ImageVector> {
            public static final AnonymousClass1 d = new AnonymousClass1();

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                ImageVector imageVector = au.com.woolworths.android.onesite.a.c((Number) obj2, composer, 1599416496, composer).e.w;
                composer.l();
                return imageVector;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonPreviewProvider$TestCase$2, reason: invalid class name */
        public static final class AnonymousClass2 implements Function2<Composer, Integer, ImageVector> {
            public static final AnonymousClass2 d = new AnonymousClass2();

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                ImageVector imageVector = au.com.woolworths.android.onesite.a.c((Number) obj2, composer, 1289357953, composer).e.w;
                composer.l();
                return imageVector;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonPreviewProvider$TestCase$3, reason: invalid class name */
        public static final class AnonymousClass3 implements Function2<Composer, Integer, ImageVector> {
            public static final AnonymousClass3 d = new AnonymousClass3();

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                ImageVector imageVector = au.com.woolworths.android.onesite.a.c((Number) obj2, composer, -173829398, composer).e.w;
                composer.l();
                return imageVector;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonPreviewProvider$TestCase$4, reason: invalid class name */
        public static final class AnonymousClass4 implements Function2<Composer, Integer, ImageVector> {
            public static final AnonymousClass4 d = new AnonymousClass4();

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                ImageVector imageVector = au.com.woolworths.android.onesite.a.c((Number) obj2, composer, -2141657209, composer).e.w;
                composer.l();
                return imageVector;
            }
        }

        static {
            IconButtonSpec.Size size = IconButtonSpec.Size.f;
            new IconButtonPreviewConfig(AnonymousClass1.d, true, size);
            TestCase testCase = new TestCase("MediumEnabled", 0);
            new IconButtonPreviewConfig(AnonymousClass2.d, false, size);
            TestCase testCase2 = new TestCase("MediumDisabled", 1);
            IconButtonSpec.Size size2 = IconButtonSpec.Size.g;
            new IconButtonPreviewConfig(AnonymousClass3.d, true, size2);
            TestCase testCase3 = new TestCase("SmallEnabled", 2);
            new IconButtonPreviewConfig(AnonymousClass4.d, false, size2);
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, new TestCase("SmallDisabled", 3)};
            d = testCaseArr;
            e = EnumEntriesKt.a(testCaseArr);
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) d.clone();
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
