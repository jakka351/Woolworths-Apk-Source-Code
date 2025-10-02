package me.oriient.ui.contentview.utils;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.ui.contentview.models.ContentColor;
import me.oriient.ui.contentview.models.ContentId;
import me.oriient.ui.contentview.models.Degrees;
import me.oriient.ui.contentview.models.Pixel;
import me.oriient.ui.contentview.models.PixelCoordinate;
import me.oriient.ui.contentview.models.PixelRect;
import me.oriient.ui.contentview.models.TouchEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0014\u001a\u00020\n*\u00020\r2\u0006\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a&\u0010\u001b\u001a\u00020\n*\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001e\u001a\u00020\u001d*\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010!\u001a\u00020\u0010*\u00020\u001c2\u0006\u0010\u000f\u001a\u00020 H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020#H\u0007¢\u0006\u0004\b\u0013\u0010$\u001a\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020%H\u0007¢\u0006\u0004\b\u0013\u0010&\u001a\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020'H\u0007¢\u0006\u0004\b\u0013\u0010(\u001a\u0019\u0010)\u001a\u00020*2\b\b\u0001\u0010)\u001a\u00020%H\u0007¢\u0006\u0004\b)\u0010+\"\u0014\u0010.\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u00101\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\",\u00108\u001a\u0004\u0018\u00010**\u0002022\b\u00103\u001a\u0004\u0018\u00010*8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107\"\u0015\u0010;\u001a\u00020\u0016*\u00020#8F¢\u0006\u0006\u001a\u0004\b9\u0010:\"\u0015\u0010;\u001a\u00020\u0016*\u00020<8F¢\u0006\u0006\u001a\u0004\b9\u0010=\"\u0015\u0010;\u001a\u00020\u0016*\u00020%8F¢\u0006\u0006\u001a\u0004\b9\u0010>\"\u0015\u0010;\u001a\u00020\u0016*\u00020'8F¢\u0006\u0006\u001a\u0004\b9\u0010?\"\u0018\u0010\u0017\u001a\u00020@*\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B\"\u0018\u0010\u0017\u001a\u00020@*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010C\"\u0018\u0010\u0017\u001a\u00020@*\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010D\"\u0018\u0010\u0017\u001a\u00020@*\u00020'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010E\"\u0015\u0010I\u001a\u00020F*\u00020#8F¢\u0006\u0006\u001a\u0004\bG\u0010H\"\u0015\u0010I\u001a\u00020F*\u00020<8F¢\u0006\u0006\u001a\u0004\bG\u0010J\"\u0015\u0010I\u001a\u00020F*\u00020%8F¢\u0006\u0006\u001a\u0004\bG\u0010K\"\u0015\u0010I\u001a\u00020F*\u00020'8F¢\u0006\u0006\u001a\u0004\bG\u0010L\"\u0015\u0010Q\u001a\u00020N*\u00020M8F¢\u0006\u0006\u001a\u0004\bO\u0010P\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006R"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "mutableCopyOf", "(Ljava/util/List;)Ljava/util/List;", "copyOf", "Landroid/view/MotionEvent;", "Lme/oriient/ui/contentview/models/TouchEvent;", "toTouchEvent", "(Landroid/view/MotionEvent;)Lme/oriient/ui/contentview/models/TouchEvent;", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "toScreenCoordinate", "(Landroid/view/MotionEvent;)Lme/oriient/ui/contentview/models/PixelCoordinate;", "Landroid/graphics/Matrix;", "Lme/oriient/ui/contentview/models/PixelRect;", "rect", "", "mapRect", "(Landroid/graphics/Matrix;Lme/oriient/ui/contentview/models/PixelRect;)V", "coordinate", "mapCoordinate", "(Landroid/graphics/Matrix;Lme/oriient/ui/contentview/models/PixelCoordinate;)Lme/oriient/ui/contentview/models/PixelCoordinate;", "Lme/oriient/ui/contentview/models/Pixel;", "x", "y", "mapPixels-MQmrOkI", "(Landroid/graphics/Matrix;FF)Lme/oriient/ui/contentview/models/PixelCoordinate;", "mapPixels", "Landroid/graphics/Path;", "", "contains", "(Landroid/graphics/Path;Lme/oriient/ui/contentview/models/PixelCoordinate;)Z", "Landroid/graphics/RectF;", "bounds", "(Landroid/graphics/Path;Landroid/graphics/RectF;)V", "", "(FF)Lme/oriient/ui/contentview/models/PixelCoordinate;", "", "(II)Lme/oriient/ui/contentview/models/PixelCoordinate;", "", "(DD)Lme/oriient/ui/contentview/models/PixelCoordinate;", "color", "Lme/oriient/ui/contentview/models/ContentColor;", "(I)Lme/oriient/ui/contentview/models/ContentColor;", "a", "Landroid/graphics/Path;", "tempPathToDetectContains", "b", "Landroid/graphics/RectF;", "tempRectToDetectContains", "Landroid/graphics/Paint;", "value", "getContentColor", "(Landroid/graphics/Paint;)Lme/oriient/ui/contentview/models/ContentColor;", "setContentColor", "(Landroid/graphics/Paint;Lme/oriient/ui/contentview/models/ContentColor;)V", "contentColor", "getPx", "(F)F", "px", "", "(J)F", "(I)F", "(D)F", "Lme/oriient/ui/contentview/models/a;", "getX", "(F)Lme/oriient/ui/contentview/models/a;", "(J)Lme/oriient/ui/contentview/models/a;", "(I)Lme/oriient/ui/contentview/models/a;", "(D)Lme/oriient/ui/contentview/models/a;", "Lme/oriient/ui/contentview/models/Degrees;", "getDg", "(F)Lme/oriient/ui/contentview/models/Degrees;", "dg", "(J)Lme/oriient/ui/contentview/models/Degrees;", "(I)Lme/oriient/ui/contentview/models/Degrees;", "(D)Lme/oriient/ui/contentview/models/Degrees;", "", "Lme/oriient/ui/contentview/models/ContentId;", "getContentId", "(Ljava/lang/String;)Lme/oriient/ui/contentview/models/ContentId;", "contentId", "ui-content-view_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ExtensionsKt {

    /* renamed from: a, reason: collision with root package name */
    private static final Path f26625a = new Path();
    private static final RectF b = new RectF();

    public static final void bounds(@NotNull Path path, @NotNull RectF rect) {
        Intrinsics.h(path, "<this>");
        Intrinsics.h(rect, "rect");
        path.computeBounds(rect, false);
    }

    @Keep
    @NotNull
    public static final ContentColor color(@ColorInt int i) {
        return new ContentColor.Int(i);
    }

    public static final boolean contains(@NotNull Path path, @NotNull PixelCoordinate coordinate) {
        Intrinsics.h(path, "<this>");
        Intrinsics.h(coordinate, "coordinate");
        Path path2 = f26625a;
        path2.reset();
        path2.moveTo(coordinate.getX(), coordinate.getY());
        RectF rectF = b;
        float f = 1;
        rectF.set(coordinate.getX() - f, coordinate.getY() - f, coordinate.getX() + f, coordinate.getY() + f);
        path2.addRect(rectF, Path.Direction.CW);
        path2.op(path, Path.Op.DIFFERENCE);
        return path2.isEmpty();
    }

    @Keep
    @NotNull
    public static final PixelCoordinate coordinate(float f, float f2) {
        return new PixelCoordinate(getPx(f), getPx(f2), null);
    }

    @NotNull
    public static final <T> List<T> copyOf(@NotNull List<? extends T> list) {
        Intrinsics.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        return arrayList;
    }

    @Nullable
    public static final ContentColor getContentColor(@NotNull Paint paint) {
        Intrinsics.h(paint, "<this>");
        return null;
    }

    @NotNull
    public static final ContentId getContentId(@NotNull String str) {
        Intrinsics.h(str, "<this>");
        return new ContentId(str);
    }

    @NotNull
    public static final Degrees getDg(float f) {
        return new Degrees(f);
    }

    public static final float getPx(float f) {
        return Pixel.m535constructorimpl(f);
    }

    @NotNull
    public static final me.oriient.ui.contentview.models.a getX(float f) {
        return new me.oriient.ui.contentview.models.a(f);
    }

    @NotNull
    public static final PixelCoordinate mapCoordinate(@NotNull Matrix matrix, @NotNull PixelCoordinate coordinate) {
        Intrinsics.h(matrix, "<this>");
        Intrinsics.h(coordinate, "coordinate");
        float[] fArr = {coordinate.getX(), coordinate.getY()};
        matrix.mapPoints(fArr);
        return new PixelCoordinate(getPx(fArr[0]), getPx(fArr[1]), null);
    }

    @NotNull
    /* renamed from: mapPixels-MQmrOkI, reason: not valid java name */
    public static final PixelCoordinate m598mapPixelsMQmrOkI(@NotNull Matrix mapPixels, float f, float f2) {
        Intrinsics.h(mapPixels, "$this$mapPixels");
        float[] fArr = {f, f2};
        mapPixels.mapPoints(fArr);
        return new PixelCoordinate(getPx(fArr[0]), getPx(fArr[1]), null);
    }

    public static final void mapRect(@NotNull Matrix matrix, @NotNull PixelRect rect) {
        Intrinsics.h(matrix, "<this>");
        Intrinsics.h(rect, "rect");
        matrix.mapRect(rect.getRectF());
        rect.set$ui_content_view_publishRelease(rect.getRectF());
    }

    @NotNull
    public static final <T> List<T> mutableCopyOf(@NotNull List<? extends T> list) {
        Intrinsics.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        return arrayList;
    }

    public static final void setContentColor(@NotNull Paint paint, @Nullable ContentColor contentColor) {
        Intrinsics.h(paint, "<this>");
        if (contentColor != null) {
            contentColor.applyToPaint(paint);
        }
    }

    @NotNull
    public static final PixelCoordinate toScreenCoordinate(@NotNull MotionEvent motionEvent) {
        Intrinsics.h(motionEvent, "<this>");
        return new PixelCoordinate(getPx(motionEvent.getRawX()), getPx(motionEvent.getRawY()), null);
    }

    @Nullable
    public static final TouchEvent toTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.h(motionEvent, "<this>");
        int action = motionEvent.getAction();
        if (action == 0) {
            return TouchEvent.TouchStarted.INSTANCE;
        }
        if (action == 1 || action == 3) {
            return TouchEvent.TouchEnded.INSTANCE;
        }
        return null;
    }

    @Keep
    @NotNull
    public static final PixelCoordinate coordinate(int i, int i2) {
        return new PixelCoordinate(getPx(i), getPx(i2), null);
    }

    @NotNull
    public static final Degrees getDg(long j) {
        return new Degrees(j);
    }

    public static final float getPx(long j) {
        return Pixel.m535constructorimpl(j);
    }

    @NotNull
    public static final me.oriient.ui.contentview.models.a getX(long j) {
        return new me.oriient.ui.contentview.models.a(j);
    }

    @Keep
    @NotNull
    public static final PixelCoordinate coordinate(double d, double d2) {
        return new PixelCoordinate(getPx(d), getPx(d2), null);
    }

    @NotNull
    public static final Degrees getDg(int i) {
        return new Degrees(i);
    }

    public static final float getPx(int i) {
        return Pixel.m535constructorimpl(i);
    }

    @NotNull
    public static final me.oriient.ui.contentview.models.a getX(int i) {
        return new me.oriient.ui.contentview.models.a(i);
    }

    @NotNull
    public static final Degrees getDg(double d) {
        return new Degrees((float) d);
    }

    public static final float getPx(double d) {
        return Pixel.m535constructorimpl((float) d);
    }

    @NotNull
    public static final me.oriient.ui.contentview.models.a getX(double d) {
        return new me.oriient.ui.contentview.models.a((float) d);
    }
}
