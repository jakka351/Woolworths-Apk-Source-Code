package androidx.compose.ui.graphics;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerImpl;
import androidx.compose.ui.graphics.layer.GraphicsLayerV23;
import androidx.compose.ui.graphics.layer.GraphicsLayerV29;
import androidx.compose.ui.graphics.layer.GraphicsViewLayer;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/AndroidGraphicsContext;", "Landroidx/compose/ui/graphics/GraphicsContext;", "Companion", "UniqueDrawingIdApi29", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class AndroidGraphicsContext implements GraphicsContext {
    public static boolean d = true;

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f1757a;
    public final Object b = new Object();
    public ViewLayerContainer c;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/AndroidGraphicsContext$1", "Landroid/content/ComponentCallbacks2;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.AndroidGraphicsContext$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 implements ComponentCallbacks2 {
        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i) {
            if (i >= 40) {
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/AndroidGraphicsContext$2", "Landroid/view/View$OnAttachStateChangeListener;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.AndroidGraphicsContext$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass2 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getContext();
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            view.getContext();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/AndroidGraphicsContext$Companion;", "", "", "enableLayerPersistence", "Z", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/AndroidGraphicsContext$UniqueDrawingIdApi29;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UniqueDrawingIdApi29 {
    }

    public AndroidGraphicsContext(AndroidComposeView androidComposeView) {
        this.f1757a = androidComposeView;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final GraphicsLayer a() {
        GraphicsLayerImpl graphicsViewLayer;
        GraphicsLayer graphicsLayer;
        synchronized (this.b) {
            try {
                AndroidComposeView androidComposeView = this.f1757a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    androidComposeView.getUniqueDrawingId();
                }
                if (i >= 29) {
                    graphicsViewLayer = new GraphicsLayerV29();
                } else if (d) {
                    try {
                        graphicsViewLayer = new GraphicsLayerV23(this.f1757a);
                    } catch (Throwable unused) {
                        d = false;
                        AndroidComposeView androidComposeView2 = this.f1757a;
                        ViewLayerContainer viewLayerContainer = this.c;
                        if (viewLayerContainer == null) {
                            ViewLayerContainer viewLayerContainer2 = new ViewLayerContainer(androidComposeView2.getContext());
                            androidComposeView2.addView(viewLayerContainer2, -1);
                            this.c = viewLayerContainer2;
                            viewLayerContainer = viewLayerContainer2;
                        }
                        graphicsViewLayer = new GraphicsViewLayer(viewLayerContainer);
                    }
                } else {
                    AndroidComposeView androidComposeView3 = this.f1757a;
                    ViewLayerContainer viewLayerContainer3 = this.c;
                    if (viewLayerContainer3 == null) {
                        ViewLayerContainer viewLayerContainer4 = new ViewLayerContainer(androidComposeView3.getContext());
                        androidComposeView3.addView(viewLayerContainer4, -1);
                        this.c = viewLayerContainer4;
                        viewLayerContainer3 = viewLayerContainer4;
                    }
                    graphicsViewLayer = new GraphicsViewLayer(viewLayerContainer3);
                }
                graphicsLayer = new GraphicsLayer(graphicsViewLayer);
            } catch (Throwable th) {
                throw th;
            }
        }
        return graphicsLayer;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public final void b(GraphicsLayer graphicsLayer) {
        synchronized (this.b) {
            if (!graphicsLayer.s) {
                graphicsLayer.s = true;
                graphicsLayer.b();
            }
        }
    }
}
