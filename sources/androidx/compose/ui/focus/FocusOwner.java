package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/focus/FocusManager;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FocusOwner extends FocusManager {
    FocusTransactionManager a();

    boolean b(KeyEvent keyEvent);

    FocusTargetNode c();

    void d();

    FocusOwnerImpl$modifier$1 e();

    boolean f(RotaryScrollEvent rotaryScrollEvent, Function0 function0);

    boolean g();

    void i(FocusTargetNode focusTargetNode);

    Boolean j(int i, Rect rect, Function1 function1);

    void k(FocusEventModifierNode focusEventModifierNode);

    boolean m();

    void n(FocusTargetNode focusTargetNode);

    boolean o(KeyEvent keyEvent, Function0 function0);

    FocusStateImpl p();

    Rect q();

    boolean r(int i, boolean z, boolean z2);

    void s();

    MutableObjectList t();
}
