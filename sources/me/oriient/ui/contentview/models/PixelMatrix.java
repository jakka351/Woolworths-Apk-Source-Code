package me.oriient.ui.contentview.models;

import android.graphics.Canvas;
import android.graphics.Matrix;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0010¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\bJ\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\nJ\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\bJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ2\u0010&\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b'\u0010\nJ \u0010,\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b*\u0010+J \u0010.\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b-\u0010+J \u00100\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b/\u0010+J\u001f\u00105\u001a\u00020\u000b2\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020 H\u0000¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u000b2\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020 H\u0000¢\u0006\u0004\b6\u00104J\u001f\u00109\u001a\u00020\u000b2\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020 H\u0000¢\u0006\u0004\b8\u00104J2\u00105\u001a\u00020\u000b2\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020 2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b<\u0010=J2\u00107\u001a\u00020\u000b2\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020 2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b>\u0010=J2\u00109\u001a\u00020\u000b2\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020 2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b?\u0010=J\u0017\u00105\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020 H\u0000¢\u0006\u0004\b3\u0010AJ\u0017\u00107\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020 H\u0000¢\u0006\u0004\b6\u0010AJ\u0017\u00109\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020 H\u0000¢\u0006\u0004\b8\u0010AJ*\u00105\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020 2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ*\u00107\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020 2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\bD\u0010CJ\u001f\u00105\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020 2\u0006\u0010F\u001a\u00020EH\u0000¢\u0006\u0004\b3\u0010GJ\u001f\u00109\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020 2\u0006\u0010F\u001a\u00020EH\u0000¢\u0006\u0004\b8\u0010GJ\u001f\u00107\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020 2\u0006\u0010F\u001a\u00020EH\u0000¢\u0006\u0004\b6\u0010GJ*\u00109\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020 2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\bH\u0010CJ\u0015\u0010J\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u001e¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u001e¢\u0006\u0004\bL\u0010KJ\u0015\u0010M\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u001e¢\u0006\u0004\bM\u0010KJ(\u0010J\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\bN\u0010OJ(\u0010L\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\bP\u0010OJ(\u0010M\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\bQ\u0010OJ\u001d\u0010J\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bJ\u0010RJ\u001d\u0010L\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bL\u0010RJ\u001d\u0010M\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bM\u0010RJ \u0010W\u001a\u00020E2\u0006\u0010S\u001a\u00020\r2\u0006\u0010T\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\bU\u0010VJ \u0010Y\u001a\u00020E2\u0006\u0010S\u001a\u00020\r2\u0006\u0010T\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\bX\u0010VJ\u0015\u0010[\u001a\u00020E2\u0006\u0010Z\u001a\u00020E¢\u0006\u0004\b[\u0010\\J\u0015\u0010_\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020]¢\u0006\u0004\b_\u0010`J\u0015\u0010c\u001a\u00020\u000b2\u0006\u0010b\u001a\u00020a¢\u0006\u0004\bc\u0010dJ\u000f\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bf\u0010gR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010hR\u0014\u0010i\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR$\u0010l\u001a\u00020 2\u0006\u0010k\u001a\u00020 8\u0000@BX\u0080.¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR$\u0010p\u001a\u00020\u001e2\u0006\u0010k\u001a\u00020\u001e8\u0006@BX\u0086.¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR$\u0010t\u001a\u00020E2\u0006\u0010k\u001a\u00020E8\u0006@BX\u0086.¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010k\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010x\u001a\u0004\b\u0005\u0010y\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006z"}, d2 = {"Lme/oriient/ui/contentview/models/PixelMatrix;", "", "Landroid/graphics/Matrix;", "matrix", "", "isInitialized", "<init>", "(Landroid/graphics/Matrix;Z)V", "()V", "pixelMatrix", "(Lme/oriient/ui/contentview/models/PixelMatrix;)V", "", "updateMatrixParams", "Lme/oriient/ui/contentview/models/Pixel;", "viewWidth", "Lme/oriient/ui/contentview/models/PixelsInViewWidth;", "getPixelsOnScreen-WBEg6MU", "(F)F", "getPixelsOnScreen", "copy", "()Lme/oriient/ui/contentview/models/PixelMatrix;", "set$ui_content_view_publishRelease", "(Landroid/graphics/Matrix;)V", "set", "reset", "", "values", "setValues", "([F)V", "copyInto", "Lme/oriient/ui/contentview/models/Degrees;", "rotation", "Lme/oriient/ui/contentview/models/a;", "scale", "translationX", "translationY", "apply-dlasf3w$ui_content_view_publishRelease", "(Lme/oriient/ui/contentview/models/Degrees;Lme/oriient/ui/contentview/models/a;FF)V", "apply", "invert", "dx", "dy", "postTranslate-oaYw5vM", "(FF)V", "postTranslate", "preTranslate-oaYw5vM", "preTranslate", "setTranslate-oaYw5vM", "setTranslate", "sx", "sy", "postScale$ui_content_view_publishRelease", "(Lme/oriient/ui/contentview/models/a;Lme/oriient/ui/contentview/models/a;)V", "postScale", "preScale$ui_content_view_publishRelease", "preScale", "setScale$ui_content_view_publishRelease", "setScale", "px", "py", "postScale-dlasf3w$ui_content_view_publishRelease", "(Lme/oriient/ui/contentview/models/a;Lme/oriient/ui/contentview/models/a;FF)V", "preScale-dlasf3w$ui_content_view_publishRelease", "setScale-dlasf3w$ui_content_view_publishRelease", "s", "(Lme/oriient/ui/contentview/models/a;)V", "postScale-MQmrOkI$ui_content_view_publishRelease", "(Lme/oriient/ui/contentview/models/a;FF)V", "preScale-MQmrOkI$ui_content_view_publishRelease", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "p", "(Lme/oriient/ui/contentview/models/a;Lme/oriient/ui/contentview/models/PixelCoordinate;)V", "setScale-MQmrOkI$ui_content_view_publishRelease", "d", "postRotate", "(Lme/oriient/ui/contentview/models/Degrees;)V", "preRotate", "setRotate", "postRotate-MQmrOkI", "(Lme/oriient/ui/contentview/models/Degrees;FF)V", "preRotate-MQmrOkI", "setRotate-MQmrOkI", "(Lme/oriient/ui/contentview/models/Degrees;Lme/oriient/ui/contentview/models/PixelCoordinate;)V", "x", "y", "invertedMapPixels-oaYw5vM", "(FF)Lme/oriient/ui/contentview/models/PixelCoordinate;", "invertedMapPixels", "mapPixels-oaYw5vM", "mapPixels", "coordinate", "mapCoordinate", "(Lme/oriient/ui/contentview/models/PixelCoordinate;)Lme/oriient/ui/contentview/models/PixelCoordinate;", "Lme/oriient/ui/contentview/models/PixelRect;", "rect", "mapRect", "(Lme/oriient/ui/contentview/models/PixelRect;)V", "Landroid/graphics/Canvas;", "canvas", "applyToCanvas", "(Landroid/graphics/Canvas;)V", "", "toString", "()Ljava/lang/String;", "Landroid/graphics/Matrix;", "matrixValues", "[F", "<set-?>", "scaleFactor", "Lme/oriient/ui/contentview/models/a;", "getScaleFactor$ui_content_view_publishRelease", "()Lme/oriient/ui/contentview/models/a;", "rotationDegrees", "Lme/oriient/ui/contentview/models/Degrees;", "getRotationDegrees", "()Lme/oriient/ui/contentview/models/Degrees;", "translation", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "getTranslation", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "Z", "()Z", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PixelMatrix {
    private boolean isInitialized;

    @NotNull
    private final Matrix matrix;

    @NotNull
    private final float[] matrixValues;
    private Degrees rotationDegrees;
    private a scaleFactor;
    private PixelCoordinate translation;

    public PixelMatrix(@NotNull Matrix matrix, boolean z) {
        Intrinsics.h(matrix, "matrix");
        this.matrix = matrix;
        this.matrixValues = new float[9];
        this.isInitialized = z;
        updateMatrixParams();
    }

    private final void updateMatrixParams() {
        this.matrix.getValues(this.matrixValues);
        double d = 2;
        this.scaleFactor = new a((float) Math.sqrt(((float) Math.pow(this.matrixValues[0], d)) + ((float) Math.pow(this.matrixValues[3], d))));
        float[] fArr = this.matrixValues;
        this.rotationDegrees = new Degrees(((float) Math.atan2(fArr[1], fArr[0])) * 57.295776f);
        this.translation = new PixelCoordinate(ExtensionsKt.getPx(this.matrixValues[2]), ExtensionsKt.getPx(this.matrixValues[5]), null);
    }

    /* renamed from: apply-dlasf3w$ui_content_view_publishRelease, reason: not valid java name */
    public final void m557applydlasf3w$ui_content_view_publishRelease(@NotNull Degrees rotation, @NotNull a scale, float translationX, float translationY) {
        Intrinsics.h(rotation, "rotation");
        Intrinsics.h(scale, "scale");
        reset();
        setRotate(rotation.unaryMinus());
        postScale$ui_content_view_publishRelease(scale);
        m564postTranslateoaYw5vM(translationX, translationY);
    }

    public final void applyToCanvas(@NotNull Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        canvas.setMatrix(this.matrix);
    }

    @NotNull
    public final PixelMatrix copy() {
        return new PixelMatrix(this);
    }

    public final void copyInto(@NotNull float[] values) {
        Intrinsics.h(values, "values");
        this.matrix.getValues(values);
    }

    /* renamed from: getPixelsOnScreen-WBEg6MU, reason: not valid java name */
    public final float m558getPixelsOnScreenWBEg6MU(float viewWidth) {
        return b.a(getScaleFactor$ui_content_view_publishRelease(), viewWidth);
    }

    @NotNull
    public final Degrees getRotationDegrees() {
        Degrees degrees = this.rotationDegrees;
        if (degrees != null) {
            return degrees;
        }
        Intrinsics.p("rotationDegrees");
        throw null;
    }

    @NotNull
    public final a getScaleFactor$ui_content_view_publishRelease() {
        a aVar = this.scaleFactor;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.p("scaleFactor");
        throw null;
    }

    @NotNull
    public final PixelCoordinate getTranslation() {
        PixelCoordinate pixelCoordinate = this.translation;
        if (pixelCoordinate != null) {
            return pixelCoordinate;
        }
        Intrinsics.p("translation");
        throw null;
    }

    public final void invert(@NotNull PixelMatrix pixelMatrix) {
        Intrinsics.h(pixelMatrix, "pixelMatrix");
        this.matrix.invert(pixelMatrix.matrix);
        this.isInitialized = true;
    }

    @NotNull
    /* renamed from: invertedMapPixels-oaYw5vM, reason: not valid java name */
    public final PixelCoordinate m559invertedMapPixelsoaYw5vM(float x, float y) {
        Matrix matrix = new Matrix();
        this.matrix.invert(matrix);
        float[] fArr = {x, y};
        matrix.mapPoints(fArr);
        return new PixelCoordinate(ExtensionsKt.getPx(fArr[0]), ExtensionsKt.getPx(fArr[1]), null);
    }

    /* renamed from: isInitialized, reason: from getter */
    public final boolean getIsInitialized() {
        return this.isInitialized;
    }

    @NotNull
    public final PixelCoordinate mapCoordinate(@NotNull PixelCoordinate coordinate) {
        Intrinsics.h(coordinate, "coordinate");
        return m560mapPixelsoaYw5vM(coordinate.getX(), coordinate.getY());
    }

    @NotNull
    /* renamed from: mapPixels-oaYw5vM, reason: not valid java name */
    public final PixelCoordinate m560mapPixelsoaYw5vM(float x, float y) {
        float[] fArr = {x, y};
        this.matrix.mapPoints(fArr);
        return new PixelCoordinate(ExtensionsKt.getPx(fArr[0]), ExtensionsKt.getPx(fArr[1]), null);
    }

    public final void mapRect(@NotNull PixelRect rect) {
        Intrinsics.h(rect, "rect");
        this.matrix.mapRect(rect.getRectF());
        rect.set$ui_content_view_publishRelease(rect.getRectF());
    }

    public final void postRotate(@NotNull Degrees d) {
        Intrinsics.h(d, "d");
        this.matrix.postRotate(d.getValue());
        this.isInitialized = true;
        updateMatrixParams();
    }

    /* renamed from: postRotate-MQmrOkI, reason: not valid java name */
    public final void m561postRotateMQmrOkI(@NotNull Degrees d, float px, float py) {
        Intrinsics.h(d, "d");
        this.matrix.postRotate(d.getValue(), px, py);
        this.isInitialized = true;
        updateMatrixParams();
    }

    public final void postScale$ui_content_view_publishRelease(@NotNull a sx, @NotNull a sy) {
        Intrinsics.h(sx, "sx");
        Intrinsics.h(sy, "sy");
        this.matrix.postScale(sx.a(), sy.a());
        this.isInitialized = true;
        updateMatrixParams();
    }

    /* renamed from: postScale-MQmrOkI$ui_content_view_publishRelease, reason: not valid java name */
    public final void m562postScaleMQmrOkI$ui_content_view_publishRelease(@NotNull a s, float px, float py) {
        Intrinsics.h(s, "s");
        this.matrix.postScale(s.a(), s.a(), px, py);
        this.isInitialized = true;
        updateMatrixParams();
    }

    /* renamed from: postScale-dlasf3w$ui_content_view_publishRelease, reason: not valid java name */
    public final void m563postScaledlasf3w$ui_content_view_publishRelease(@NotNull a sx, @NotNull a sy, float px, float py) {
        Intrinsics.h(sx, "sx");
        Intrinsics.h(sy, "sy");
        this.matrix.postScale(sx.a(), sy.a(), px, py);
        this.isInitialized = true;
        updateMatrixParams();
    }

    /* renamed from: postTranslate-oaYw5vM, reason: not valid java name */
    public final void m564postTranslateoaYw5vM(float dx, float dy) {
        this.matrix.postTranslate(dx, dy);
        this.isInitialized = true;
        updateMatrixParams();
    }

    public final void preRotate(@NotNull Degrees d) {
        Intrinsics.h(d, "d");
        this.matrix.preRotate(d.getValue());
        this.isInitialized = true;
        updateMatrixParams();
    }

    /* renamed from: preRotate-MQmrOkI, reason: not valid java name */
    public final void m565preRotateMQmrOkI(@NotNull Degrees d, float px, float py) {
        Intrinsics.h(d, "d");
        this.matrix.preRotate(d.getValue(), px, py);
        this.isInitialized = true;
        updateMatrixParams();
    }

    public final void preScale$ui_content_view_publishRelease(@NotNull a sx, @NotNull a sy) {
        Intrinsics.h(sx, "sx");
        Intrinsics.h(sy, "sy");
        this.matrix.preScale(sx.a(), sy.a());
        this.isInitialized = true;
        updateMatrixParams();
    }

    /* renamed from: preScale-MQmrOkI$ui_content_view_publishRelease, reason: not valid java name */
    public final void m566preScaleMQmrOkI$ui_content_view_publishRelease(@NotNull a s, float px, float py) {
        Intrinsics.h(s, "s");
        this.matrix.preScale(s.a(), s.a(), px, py);
        this.isInitialized = true;
        updateMatrixParams();
    }

    /* renamed from: preScale-dlasf3w$ui_content_view_publishRelease, reason: not valid java name */
    public final void m567preScaledlasf3w$ui_content_view_publishRelease(@NotNull a sx, @NotNull a sy, float px, float py) {
        Intrinsics.h(sx, "sx");
        Intrinsics.h(sy, "sy");
        this.matrix.preScale(sx.a(), sy.a(), px, py);
        this.isInitialized = true;
        updateMatrixParams();
    }

    /* renamed from: preTranslate-oaYw5vM, reason: not valid java name */
    public final void m568preTranslateoaYw5vM(float dx, float dy) {
        this.matrix.preTranslate(dx, dy);
        this.isInitialized = true;
        updateMatrixParams();
    }

    public final void reset() {
        this.matrix.reset();
        this.isInitialized = false;
        updateMatrixParams();
    }

    public final void set(@NotNull PixelMatrix pixelMatrix) {
        Intrinsics.h(pixelMatrix, "pixelMatrix");
        set$ui_content_view_publishRelease(pixelMatrix.matrix);
    }

    public final void set$ui_content_view_publishRelease(@NotNull Matrix matrix) {
        Intrinsics.h(matrix, "matrix");
        this.matrix.set(matrix);
        this.isInitialized = true;
        updateMatrixParams();
    }

    public final void setRotate(@NotNull Degrees d) {
        Intrinsics.h(d, "d");
        this.matrix.setRotate(d.getValue());
        this.isInitialized = true;
        updateMatrixParams();
    }

    /* renamed from: setRotate-MQmrOkI, reason: not valid java name */
    public final void m569setRotateMQmrOkI(@NotNull Degrees d, float px, float py) {
        Intrinsics.h(d, "d");
        this.matrix.setRotate(d.getValue(), px, py);
        this.isInitialized = true;
        updateMatrixParams();
    }

    public final void setScale$ui_content_view_publishRelease(@NotNull a sx, @NotNull a sy) {
        Intrinsics.h(sx, "sx");
        Intrinsics.h(sy, "sy");
        this.matrix.setScale(sx.a(), sy.a());
        this.isInitialized = true;
        updateMatrixParams();
    }

    /* renamed from: setScale-MQmrOkI$ui_content_view_publishRelease, reason: not valid java name */
    public final void m570setScaleMQmrOkI$ui_content_view_publishRelease(@NotNull a s, float px, float py) {
        Intrinsics.h(s, "s");
        this.matrix.setScale(s.a(), s.a(), px, py);
        this.isInitialized = true;
        updateMatrixParams();
    }

    /* renamed from: setScale-dlasf3w$ui_content_view_publishRelease, reason: not valid java name */
    public final void m571setScaledlasf3w$ui_content_view_publishRelease(@NotNull a sx, @NotNull a sy, float px, float py) {
        Intrinsics.h(sx, "sx");
        Intrinsics.h(sy, "sy");
        this.matrix.setScale(sx.a(), sy.a(), px, py);
        this.isInitialized = true;
        updateMatrixParams();
    }

    /* renamed from: setTranslate-oaYw5vM, reason: not valid java name */
    public final void m572setTranslateoaYw5vM(float dx, float dy) {
        this.matrix.setTranslate(dx, dy);
        this.isInitialized = true;
        updateMatrixParams();
    }

    public final void setValues(@NotNull float[] values) {
        Intrinsics.h(values, "values");
        this.matrix.setValues(values);
        this.isInitialized = true;
        updateMatrixParams();
    }

    @NotNull
    public String toString() {
        return "PixelMatrix(matrix=" + this.matrix + ", scaleFactor=" + getScaleFactor$ui_content_view_publishRelease() + ", rotationDegrees=" + getRotationDegrees() + ", translation=" + getTranslation() + ')';
    }

    public final void postRotate(@NotNull Degrees d, @NotNull PixelCoordinate p) {
        Intrinsics.h(d, "d");
        Intrinsics.h(p, "p");
        this.matrix.postRotate(d.getValue(), p.getX(), p.getY());
        this.isInitialized = true;
        updateMatrixParams();
    }

    public final void postScale$ui_content_view_publishRelease(@NotNull a s) {
        Intrinsics.h(s, "s");
        this.matrix.postScale(s.a(), s.a());
        this.isInitialized = true;
        updateMatrixParams();
    }

    public final void preRotate(@NotNull Degrees d, @NotNull PixelCoordinate p) {
        Intrinsics.h(d, "d");
        Intrinsics.h(p, "p");
        this.matrix.preRotate(d.getValue(), p.getX(), p.getY());
        this.isInitialized = true;
        updateMatrixParams();
    }

    public final void preScale$ui_content_view_publishRelease(@NotNull a s) {
        Intrinsics.h(s, "s");
        this.matrix.preScale(s.a(), s.a());
        this.isInitialized = true;
        updateMatrixParams();
    }

    public final void setRotate(@NotNull Degrees d, @NotNull PixelCoordinate p) {
        Intrinsics.h(d, "d");
        Intrinsics.h(p, "p");
        this.matrix.setRotate(d.getValue(), p.getX(), p.getY());
        this.isInitialized = true;
        updateMatrixParams();
    }

    public final void setScale$ui_content_view_publishRelease(@NotNull a s) {
        Intrinsics.h(s, "s");
        this.matrix.setScale(s.a(), s.a());
        this.isInitialized = true;
        updateMatrixParams();
    }

    public /* synthetic */ PixelMatrix(Matrix matrix, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(matrix, (i & 2) != 0 ? false : z);
    }

    public PixelMatrix() {
        this(new Matrix(), false, 2, null);
    }

    public final void postScale$ui_content_view_publishRelease(@NotNull a s, @NotNull PixelCoordinate p) {
        Intrinsics.h(s, "s");
        Intrinsics.h(p, "p");
        this.matrix.postScale(s.a(), s.a(), p.getX(), p.getY());
        updateMatrixParams();
    }

    public final void preScale$ui_content_view_publishRelease(@NotNull a s, @NotNull PixelCoordinate p) {
        Intrinsics.h(s, "s");
        Intrinsics.h(p, "p");
        this.matrix.preScale(s.a(), s.a(), p.getX(), p.getY());
        this.isInitialized = true;
        updateMatrixParams();
    }

    public final void setScale$ui_content_view_publishRelease(@NotNull a s, @NotNull PixelCoordinate p) {
        Intrinsics.h(s, "s");
        Intrinsics.h(p, "p");
        this.matrix.setScale(s.a(), s.a(), p.getX(), p.getY());
        this.isInitialized = true;
        updateMatrixParams();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PixelMatrix(@NotNull PixelMatrix pixelMatrix) {
        this(new Matrix(pixelMatrix.matrix), pixelMatrix.isInitialized);
        Intrinsics.h(pixelMatrix, "pixelMatrix");
    }
}
