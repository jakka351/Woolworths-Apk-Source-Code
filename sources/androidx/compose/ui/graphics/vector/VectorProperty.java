package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0010\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0010\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Fill", "FillAlpha", "PathData", "PivotX", "PivotY", "Rotation", "ScaleX", "ScaleY", "Stroke", "StrokeAlpha", "StrokeLineWidth", "TranslateX", "TranslateY", "TrimPathEnd", "TrimPathOffset", "TrimPathStart", "Landroidx/compose/ui/graphics/vector/VectorProperty$Fill;", "Landroidx/compose/ui/graphics/vector/VectorProperty$FillAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty$PathData;", "Landroidx/compose/ui/graphics/vector/VectorProperty$PivotX;", "Landroidx/compose/ui/graphics/vector/VectorProperty$PivotY;", "Landroidx/compose/ui/graphics/vector/VectorProperty$Rotation;", "Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleX;", "Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleY;", "Landroidx/compose/ui/graphics/vector/VectorProperty$Stroke;", "Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeLineWidth;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateX;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateY;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathEnd;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathOffset;", "Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathStart;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class VectorProperty<T> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$Fill;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "Landroidx/compose/ui/graphics/Brush;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Fill extends VectorProperty<Brush> {

        /* renamed from: a, reason: collision with root package name */
        public static final Fill f1822a = new Fill();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$FillAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FillAlpha extends VectorProperty<Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final FillAlpha f1823a = new FillAlpha();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$PathData;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PathData extends VectorProperty<List<? extends PathNode>> {

        /* renamed from: a, reason: collision with root package name */
        public static final PathData f1824a = new PathData();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$PivotX;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PivotX extends VectorProperty<Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final PivotX f1825a = new PivotX();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$PivotY;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PivotY extends VectorProperty<Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final PivotY f1826a = new PivotY();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$Rotation;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Rotation extends VectorProperty<Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final Rotation f1827a = new Rotation();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleX;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScaleX extends VectorProperty<Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final ScaleX f1828a = new ScaleX();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$ScaleY;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScaleY extends VectorProperty<Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final ScaleY f1829a = new ScaleY();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$Stroke;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "Landroidx/compose/ui/graphics/Brush;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Stroke extends VectorProperty<Brush> {

        /* renamed from: a, reason: collision with root package name */
        public static final Stroke f1830a = new Stroke();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeAlpha;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StrokeAlpha extends VectorProperty<Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final StrokeAlpha f1831a = new StrokeAlpha();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$StrokeLineWidth;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StrokeLineWidth extends VectorProperty<Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final StrokeLineWidth f1832a = new StrokeLineWidth();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateX;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TranslateX extends VectorProperty<Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final TranslateX f1833a = new TranslateX();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TranslateY;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TranslateY extends VectorProperty<Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final TranslateY f1834a = new TranslateY();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathEnd;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TrimPathEnd extends VectorProperty<Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final TrimPathEnd f1835a = new TrimPathEnd();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathOffset;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TrimPathOffset extends VectorProperty<Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final TrimPathOffset f1836a = new TrimPathOffset();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorProperty$TrimPathStart;", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TrimPathStart extends VectorProperty<Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final TrimPathStart f1837a = new TrimPathStart();
    }
}
