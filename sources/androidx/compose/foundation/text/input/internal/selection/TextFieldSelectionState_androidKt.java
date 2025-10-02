package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.foundation.text.MenuItemsAvailability;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldSelectionState_androidKt {
    public static final Function1 a(final TextFieldSelectionState textFieldSelectionState, final ContextMenuState contextMenuState, final MutableState mutableState, final Function2 function2) {
        return new Function1<ContextMenuScope, Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ContextMenuScope contextMenuScope = (ContextMenuScope) obj;
                int i = ((MenuItemsAvailability) mutableState.getD()).f1125a;
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.e;
                boolean z = (i & 4) == 4;
                final ContextMenuState contextMenuState2 = contextMenuState;
                final Function2 function22 = function2;
                final TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                if (z) {
                    ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems), new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function22.invoke(textFieldSelectionState2, TextContextMenuItems.e);
                            ContextMenuState_androidKt.a(contextMenuState2);
                            return Unit.f24250a;
                        }
                    });
                }
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.f;
                if ((i & 1) == 1) {
                    ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems2), new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function22.invoke(textFieldSelectionState2, TextContextMenuItems.f);
                            ContextMenuState_androidKt.a(contextMenuState2);
                            return Unit.f24250a;
                        }
                    });
                }
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.g;
                if ((i & 2) == 2) {
                    ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems3), new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function22.invoke(textFieldSelectionState2, TextContextMenuItems.g);
                            ContextMenuState_androidKt.a(contextMenuState2);
                            return Unit.f24250a;
                        }
                    });
                }
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.h;
                if ((i & 8) == 8) {
                    ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems4), new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function22.invoke(textFieldSelectionState2, TextContextMenuItems.h);
                            ContextMenuState_androidKt.a(contextMenuState2);
                            return Unit.f24250a;
                        }
                    });
                }
                TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.i;
                if ((i & 16) == 16) {
                    ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems5), new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function22.invoke(textFieldSelectionState2, TextContextMenuItems.i);
                            ContextMenuState_androidKt.a(contextMenuState2);
                            return Unit.f24250a;
                        }
                    });
                }
                return Unit.f24250a;
            }
        };
    }
}
