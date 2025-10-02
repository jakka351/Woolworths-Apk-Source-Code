package au.com.woolworths.foundation.shop.prompt.handler.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.foundation.shop.prompt.handler.data.PromptBottomSheet;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/ui/BottomSheetPromptFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Companion", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BottomSheetPromptFragment extends BottomSheetDialogFragment {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/ui/BottomSheetPromptFragment$Companion;", "", "", "RequestKey", "Ljava/lang/String;", "ResultKeyAction", "PromptBottomSheetExtra", "Tag", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        Bundle arguments = getArguments();
        Parcelable parcelable = arguments != null ? arguments.getParcelable("PromptBottomSheetExtra") : null;
        if (parcelable == null) {
            throw new IllegalArgumentException("PromptBottomSheet data was not provided");
        }
        final PromptBottomSheet promptBottomSheet = (PromptBottomSheet) parcelable;
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.prompt.handler.ui.BottomSheetPromptFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final PromptBottomSheet promptBottomSheet2 = promptBottomSheet;
                    final BottomSheetPromptFragment bottomSheetPromptFragment = this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1778118388, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.prompt.handler.ui.BottomSheetPromptFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                BottomSheetPromptFragment bottomSheetPromptFragment2 = bottomSheetPromptFragment;
                                boolean zI = composer2.I(bottomSheetPromptFragment2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new BottomSheetPromptFragment$onCreateView$1$1$1$1$1(1, bottomSheetPromptFragment2, BottomSheetPromptFragment.class, "onActionClick", "onActionClick(Lau/com/woolworths/sdui/model/action/ActionData;)V", 0);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                BottomSheetPromptContentKt.a(promptBottomSheet2, (Function1) ((KFunction) objG), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1477604432));
        return composeView;
    }
}
