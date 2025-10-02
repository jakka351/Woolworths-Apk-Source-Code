package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV28;", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "GraphicsLayerPicture", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayerSnapshotV28 implements LayerSnapshotImpl {

    /* renamed from: a, reason: collision with root package name */
    public static final LayerSnapshotV28 f1810a = new LayerSnapshotV28();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV28$GraphicsLayerPicture;", "Landroid/graphics/Picture;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class GraphicsLayerPicture extends Picture {
        @Override // android.graphics.Picture
        public final Canvas beginRecording(int i, int i2) {
            return new Canvas();
        }

        @Override // android.graphics.Picture
        public final void draw(Canvas canvas) {
            Canvas canvas2 = AndroidCanvas_androidKt.f1756a;
            new AndroidCanvas().f1755a = canvas;
            throw null;
        }

        @Override // android.graphics.Picture
        public final void endRecording() {
        }

        @Override // android.graphics.Picture
        public final int getHeight() {
            throw null;
        }

        @Override // android.graphics.Picture
        public final int getWidth() {
            throw null;
        }

        @Override // android.graphics.Picture
        public final boolean requiresHardwareAcceleration() {
            return true;
        }
    }
}
