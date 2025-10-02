package au.com.woolworths.foundation.shop.prompt.handler.ui;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum;
import au.com.woolworths.foundation.shop.prompt.handler.data.PromptBottomSheet;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.button.model.CoreButtonModel;
import au.com.woolworths.sdui.common.button.model.CoreButtonStyle;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/ui/BottomSheetPromptPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/shop/prompt/handler/data/PromptBottomSheet;", "TestCase", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BottomSheetPromptPreviewProvider implements PreviewParameterProvider<PromptBottomSheet> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/ui/BottomSheetPromptPreviewProvider$TestCase;", "", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            String strA = a.A("This is a long sample prompt message to illustrate the bottom sheet layout behaviour. ", SequencesKt.p(new LoremIpsum(40).getValues(), null, null, 63));
            CoreButtonStyle coreButtonStyle = CoreButtonStyle.d;
            ActionType actionType = ActionType.d;
            CoreButtonModel coreButtonModel = new CoreButtonModel(coreButtonStyle, "Primary action", null, null, new ActionData("sample_action", actionType, null, null), true);
            CoreButtonStyle coreButtonStyle2 = CoreButtonStyle.e;
            new PromptBottomSheet(null, "Sample Prompt Title", strA, CollectionsKt.R(coreButtonModel, new CoreButtonModel(coreButtonStyle2, "Secondary action", null, null, new ActionData("sample_action", actionType, null, null), true), new CoreButtonModel(CoreButtonStyle.g, "Destructive action", null, null, new ActionData("sample_action", actionType, null, null), true)));
            TestCase testCase = new TestCase("Sample", 0);
            new PromptBottomSheet(new IconAsset.CoreIcon("icon.navigation.login"), "Ready to shop?", "Log in to add items to your cart, checkout, and unlock more value.", CollectionsKt.R(new CoreButtonModel(coreButtonStyle, "Log in", null, null, new ActionData("sample_action", actionType, null, null), true), new CoreButtonModel(coreButtonStyle2, "Sign up", null, null, new ActionData("sample_action", actionType, null, null), true)));
            TestCase[] testCaseArr = {testCase, new TestCase("Login", 1)};
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
