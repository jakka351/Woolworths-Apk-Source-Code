package com.airbnb.epoxy;

import android.view.View;

/* loaded from: classes4.dex */
public abstract class EpoxyTouchHelper {

    public static class DragBuilder {
    }

    public static class DragBuilder2 {
    }

    public static class DragBuilder3 {
    }

    public static class DragBuilder4<U extends EpoxyModel> {

        /* renamed from: com.airbnb.epoxy.EpoxyTouchHelper$DragBuilder4$1, reason: invalid class name */
        class AnonymousClass1 extends EpoxyModelTouchCallback<EpoxyModel> {
            @Override // com.airbnb.epoxy.BaseEpoxyTouchCallback
            public final int a(EpoxyModel epoxyModel) {
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            public final void p() {
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            public final boolean q(EpoxyModel epoxyModel) {
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            public final void r() {
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            public final void s() {
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            public final void t() {
                throw null;
            }
        }
    }

    public static abstract class DragCallbacks<T extends EpoxyModel> implements EpoxyDragCallback<T> {
    }

    public static class SwipeBuilder {
    }

    public static class SwipeBuilder2 {
    }

    public static class SwipeBuilder3<U extends EpoxyModel> {

        /* renamed from: com.airbnb.epoxy.EpoxyTouchHelper$SwipeBuilder3$1, reason: invalid class name */
        class AnonymousClass1 extends EpoxyModelTouchCallback<EpoxyModel> {
            @Override // com.airbnb.epoxy.BaseEpoxyTouchCallback
            public final int a(EpoxyModel epoxyModel) {
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            public final void p() {
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            public final boolean q(EpoxyModel epoxyModel) {
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            public final void u(EpoxyModel epoxyModel, View view) {
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            public final void v() {
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            public final void w() {
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            public final void x() {
                throw null;
            }
        }
    }

    public static abstract class SwipeCallbacks<T extends EpoxyModel> implements EpoxySwipeCallback<T> {
    }
}
