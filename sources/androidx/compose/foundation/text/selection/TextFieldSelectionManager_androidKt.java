package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.MagnifierElement;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.foundation.text.MenuItemsAvailability;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "magnifierSize", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldSelectionManager_androidKt {
    public static final Function1 a(final TextFieldSelectionManager textFieldSelectionManager, final ContextMenuState contextMenuState, final MutableState mutableState) {
        return new Function1<ContextMenuScope, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1
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
                final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                if (z) {
                    ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems), new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            textFieldSelectionManager2.f();
                            ContextMenuState_androidKt.a(contextMenuState2);
                            return Unit.f24250a;
                        }
                    });
                }
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.f;
                if ((i & 1) == 1) {
                    ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems2), new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            textFieldSelectionManager2.d(false);
                            ContextMenuState_androidKt.a(contextMenuState2);
                            return Unit.f24250a;
                        }
                    });
                }
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.g;
                if ((i & 2) == 2) {
                    ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems3), new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            textFieldSelectionManager2.o();
                            ContextMenuState_androidKt.a(contextMenuState2);
                            return Unit.f24250a;
                        }
                    });
                }
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.h;
                if ((i & 8) == 8) {
                    ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems4), new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            textFieldSelectionManager2.p();
                            ContextMenuState_androidKt.a(contextMenuState2);
                            return Unit.f24250a;
                        }
                    });
                }
                TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.i;
                if (textFieldSelectionManager2.j() && TextRange.c(textFieldSelectionManager2.m().b)) {
                    ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems5), new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ?? r0 = textFieldSelectionManager2.g;
                            if (r0 != 0) {
                                r0.invoke();
                            }
                            ContextMenuState_androidKt.a(contextMenuState2);
                            return Unit.f24250a;
                        }
                    });
                }
                return Unit.f24250a;
            }
        };
    }

    public static final Modifier b(final TextFieldSelectionManager textFieldSelectionManager) {
        SemanticsPropertyKey semanticsPropertyKey = Magnifier_androidKt.f839a;
        return ComposedModifierKt.a(Modifier.Companion.d, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier modifier = (Modifier) obj;
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                composer.o(1980580247);
                final Density density = (Density) composer.x(CompositionLocalsKt.h);
                Object objG = composer.G();
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                if (objG == composer$Companion$Empty$1) {
                    objG = SnapshotStateKt.f(new IntSize(0L));
                    composer.A(objG);
                }
                final MutableState mutableState = (MutableState) objG;
                final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                boolean zI = composer.I(textFieldSelectionManager2);
                Object objG2 = composer.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    objG2 = new Function0<Offset>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
                        @Override // kotlin.jvm.functions.Function0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke() {
                            /*
                                Method dump skipped, instructions count: 246
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1$1.invoke():java.lang.Object");
                        }
                    };
                    composer.A(objG2);
                }
                Function0 function0 = (Function0) objG2;
                boolean zN = composer.n(density);
                Object objG3 = composer.G();
                if (zN || objG3 == composer$Companion$Empty$1) {
                    objG3 = new Function1<Function0<? extends Offset>, Modifier>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            final Function0 function02 = (Function0) obj4;
                            Function1<Density, Offset> function1 = new Function1<Density, Offset>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    return new Offset(((Offset) function02.invoke()).f1751a);
                                }
                            };
                            final Density density2 = density;
                            final MutableState mutableState2 = mutableState;
                            return new MagnifierElement(function1, new Function1<DpSize, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    float fB = DpSize.b(((DpSize) obj5).f2199a);
                                    Density density3 = density2;
                                    mutableState2.setValue(new IntSize((density3.r1(fB) << 32) | (density3.r1(DpSize.a(r0)) & 4294967295L)));
                                    return Unit.f24250a;
                                }
                            }, PlatformMagnifierFactory.Companion.a());
                        }
                    };
                    composer.A(objG3);
                }
                AnimationVector2D animationVector2D = SelectionMagnifierKt.f1213a;
                Modifier modifierA = ComposedModifierKt.a(modifier, InspectableValueKt.a(), new SelectionMagnifierKt$animatedSelectionMagnifier$1(function0, (Function1) objG3));
                composer.l();
                return modifierA;
            }
        });
    }
}
