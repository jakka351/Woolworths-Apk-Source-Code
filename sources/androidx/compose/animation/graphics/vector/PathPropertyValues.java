package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/graphics/vector/PathPropertyValues;", "Landroidx/compose/animation/graphics/vector/PropertyValues;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PathPropertyValues extends PropertyValues<List<? extends PathNode>> {
    @Override // androidx.compose.animation.graphics.vector.PropertyValues
    public final State a(Transition transition, String str, final int i, Composer composer, int i2) {
        composer.o(119461169);
        Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> function3 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.graphics.vector.PathPropertyValues$createState$timeState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Composer composer2 = (Composer) obj2;
                ((Number) obj3).intValue();
                composer2.o(2115989621);
                b bVar = EasingKt.d;
                int i3 = i;
                FiniteAnimationSpec finiteAnimationSpecE = AnimationSpecKt.e(i3, 0, bVar, 2);
                if (!((Boolean) ((Transition.Segment) obj).getB()).booleanValue()) {
                    finiteAnimationSpecE = new ReversedSpec(finiteAnimationSpecE, i3);
                }
                composer2.l();
                return finiteAnimationSpecE;
            }
        };
        int i3 = (i2 & 14) | ((i2 << 3) & 896);
        TwoWayConverter twoWayConverter = VectorConvertersKt.f788a;
        int i4 = ((i3 << 3) & 7168) | (i3 & 14);
        boolean zBooleanValue = ((Boolean) transition.f776a.a()).booleanValue();
        composer.o(-1210845840);
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = zBooleanValue ? i : 0.0f;
        composer.l();
        Float fValueOf = Float.valueOf(f2);
        boolean zBooleanValue2 = ((Boolean) ((SnapshotMutableStateImpl) transition.d).getD()).booleanValue();
        composer.o(-1210845840);
        if (zBooleanValue2) {
            f = i;
        }
        composer.l();
        final Transition.TransitionAnimationState transitionAnimationStateD = TransitionKt.d(transition, fValueOf, Float.valueOf(f), (FiniteAnimationSpec) function3.invoke(transition.f(), composer, 0), twoWayConverter, composer, (i4 & 14) | ((i4 << 6) & 458752));
        boolean zN = composer.n(transitionAnimationStateD) | ((((i2 & 7168) ^ 3072) > 2048 && composer.n(this)) || (i2 & 3072) == 2048);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new Function0<List<? extends PathNode>>() { // from class: androidx.compose.animation.graphics.vector.PathPropertyValues$createState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Object objPrevious;
                    PathNode reflectiveQuadTo;
                    PathNode arcTo;
                    float fFloatValue = ((Number) transitionAnimationStateD.getD()).floatValue();
                    ArrayList arrayList = this.h.f814a;
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                        if (((Timestamp) objPrevious).f819a <= fFloatValue) {
                            break;
                        }
                    }
                    Timestamp timestamp = (Timestamp) objPrevious;
                    if (timestamp == null) {
                        timestamp = (Timestamp) CollectionsKt.D(arrayList);
                    }
                    float f3 = (fFloatValue - timestamp.f819a) / timestamp.b;
                    if (timestamp.c != 0) {
                        int i5 = 0;
                        while (f3 > 1.0f) {
                            f3 -= 1.0f;
                            i5++;
                        }
                        if (timestamp.d == RepeatMode.e && i5 % 2 != 0) {
                            f3 = 1.0f - f3;
                        }
                    }
                    ArrayList arrayList2 = ((PropertyValuesHolderPath) timestamp.e).b;
                    Iterator it = arrayList2.iterator();
                    int i6 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i6 = -1;
                            break;
                        }
                        if (((Keyframe) it.next()).f812a >= f3) {
                            break;
                        }
                        i6++;
                    }
                    int i7 = i6 - 1;
                    if (i7 < 0) {
                        i7 = 0;
                    }
                    int i8 = i7 + 1;
                    Easing easing = ((Keyframe) arrayList2.get(i8)).c;
                    float f4 = (f3 - ((Keyframe) arrayList2.get(i7)).f812a) / (((Keyframe) arrayList2.get(i8)).f812a - ((Keyframe) arrayList2.get(i7)).f812a);
                    if (f4 < BitmapDescriptorFactory.HUE_RED) {
                        f4 = 0.0f;
                    }
                    float fA = easing.a(f4 <= 1.0f ? f4 : 1.0f);
                    List list = (List) ((Keyframe) arrayList2.get(i7)).b;
                    List list2 = (List) ((Keyframe) arrayList2.get(i8)).b;
                    int iMin = Math.min(list.size(), list2.size());
                    ArrayList arrayList3 = new ArrayList(iMin);
                    for (int i9 = 0; i9 < iMin; i9++) {
                        Object obj = list.get(i9);
                        PathNode pathNode = (PathNode) list2.get(i9);
                        PathNode pathNode2 = (PathNode) obj;
                        if (pathNode2 instanceof PathNode.RelativeMoveTo) {
                            if (!(pathNode instanceof PathNode.RelativeMoveTo)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode2;
                            PathNode.RelativeMoveTo relativeMoveTo2 = (PathNode.RelativeMoveTo) pathNode;
                            reflectiveQuadTo = new PathNode.RelativeMoveTo(MathHelpersKt.b(relativeMoveTo.c, relativeMoveTo2.c, fA), MathHelpersKt.b(relativeMoveTo.d, relativeMoveTo2.d, fA));
                        } else if (pathNode2 instanceof PathNode.MoveTo) {
                            if (!(pathNode instanceof PathNode.MoveTo)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode2;
                            PathNode.MoveTo moveTo2 = (PathNode.MoveTo) pathNode;
                            reflectiveQuadTo = new PathNode.MoveTo(MathHelpersKt.b(moveTo.c, moveTo2.c, fA), MathHelpersKt.b(moveTo.d, moveTo2.d, fA));
                        } else if (pathNode2 instanceof PathNode.RelativeLineTo) {
                            if (!(pathNode instanceof PathNode.RelativeLineTo)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode2;
                            PathNode.RelativeLineTo relativeLineTo2 = (PathNode.RelativeLineTo) pathNode;
                            reflectiveQuadTo = new PathNode.RelativeLineTo(MathHelpersKt.b(relativeLineTo.c, relativeLineTo2.c, fA), MathHelpersKt.b(relativeLineTo.d, relativeLineTo2.d, fA));
                        } else if (pathNode2 instanceof PathNode.LineTo) {
                            if (!(pathNode instanceof PathNode.LineTo)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            PathNode.LineTo lineTo = (PathNode.LineTo) pathNode2;
                            PathNode.LineTo lineTo2 = (PathNode.LineTo) pathNode;
                            reflectiveQuadTo = new PathNode.LineTo(MathHelpersKt.b(lineTo.c, lineTo2.c, fA), MathHelpersKt.b(lineTo.d, lineTo2.d, fA));
                        } else if (pathNode2 instanceof PathNode.RelativeHorizontalTo) {
                            if (!(pathNode instanceof PathNode.RelativeHorizontalTo)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            reflectiveQuadTo = new PathNode.RelativeHorizontalTo(MathHelpersKt.b(((PathNode.RelativeHorizontalTo) pathNode2).c, ((PathNode.RelativeHorizontalTo) pathNode).c, fA));
                        } else if (pathNode2 instanceof PathNode.HorizontalTo) {
                            if (!(pathNode instanceof PathNode.HorizontalTo)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            reflectiveQuadTo = new PathNode.HorizontalTo(MathHelpersKt.b(((PathNode.HorizontalTo) pathNode2).c, ((PathNode.HorizontalTo) pathNode).c, fA));
                        } else if (pathNode2 instanceof PathNode.RelativeVerticalTo) {
                            if (!(pathNode instanceof PathNode.RelativeVerticalTo)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            reflectiveQuadTo = new PathNode.RelativeVerticalTo(MathHelpersKt.b(((PathNode.RelativeVerticalTo) pathNode2).c, ((PathNode.RelativeVerticalTo) pathNode).c, fA));
                        } else if (!(pathNode2 instanceof PathNode.VerticalTo)) {
                            if (pathNode2 instanceof PathNode.RelativeCurveTo) {
                                if (!(pathNode instanceof PathNode.RelativeCurveTo)) {
                                    throw new IllegalArgumentException("start and stop path nodes have different types");
                                }
                                PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode2;
                                PathNode.RelativeCurveTo relativeCurveTo2 = (PathNode.RelativeCurveTo) pathNode;
                                arcTo = new PathNode.RelativeCurveTo(MathHelpersKt.b(relativeCurveTo.c, relativeCurveTo2.c, fA), MathHelpersKt.b(relativeCurveTo.d, relativeCurveTo2.d, fA), MathHelpersKt.b(relativeCurveTo.e, relativeCurveTo2.e, fA), MathHelpersKt.b(relativeCurveTo.f, relativeCurveTo2.f, fA), MathHelpersKt.b(relativeCurveTo.g, relativeCurveTo2.g, fA), MathHelpersKt.b(relativeCurveTo.h, relativeCurveTo2.h, fA));
                            } else if (pathNode2 instanceof PathNode.CurveTo) {
                                if (!(pathNode instanceof PathNode.CurveTo)) {
                                    throw new IllegalArgumentException("start and stop path nodes have different types");
                                }
                                PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode2;
                                PathNode.CurveTo curveTo2 = (PathNode.CurveTo) pathNode;
                                arcTo = new PathNode.CurveTo(MathHelpersKt.b(curveTo.c, curveTo2.c, fA), MathHelpersKt.b(curveTo.d, curveTo2.d, fA), MathHelpersKt.b(curveTo.e, curveTo2.e, fA), MathHelpersKt.b(curveTo.f, curveTo2.f, fA), MathHelpersKt.b(curveTo.g, curveTo2.g, fA), MathHelpersKt.b(curveTo.h, curveTo2.h, fA));
                            } else if (pathNode2 instanceof PathNode.RelativeReflectiveCurveTo) {
                                if (!(pathNode instanceof PathNode.RelativeReflectiveCurveTo)) {
                                    throw new IllegalArgumentException("start and stop path nodes have different types");
                                }
                                PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode2;
                                PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo2 = (PathNode.RelativeReflectiveCurveTo) pathNode;
                                reflectiveQuadTo = new PathNode.RelativeReflectiveCurveTo(MathHelpersKt.b(relativeReflectiveCurveTo.c, relativeReflectiveCurveTo2.c, fA), MathHelpersKt.b(relativeReflectiveCurveTo.d, relativeReflectiveCurveTo2.d, fA), MathHelpersKt.b(relativeReflectiveCurveTo.e, relativeReflectiveCurveTo2.e, fA), MathHelpersKt.b(relativeReflectiveCurveTo.f, relativeReflectiveCurveTo2.f, fA));
                            } else if (pathNode2 instanceof PathNode.ReflectiveCurveTo) {
                                if (!(pathNode instanceof PathNode.ReflectiveCurveTo)) {
                                    throw new IllegalArgumentException("start and stop path nodes have different types");
                                }
                                PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode2;
                                PathNode.ReflectiveCurveTo reflectiveCurveTo2 = (PathNode.ReflectiveCurveTo) pathNode;
                                reflectiveQuadTo = new PathNode.ReflectiveCurveTo(MathHelpersKt.b(reflectiveCurveTo.c, reflectiveCurveTo2.c, fA), MathHelpersKt.b(reflectiveCurveTo.d, reflectiveCurveTo2.d, fA), MathHelpersKt.b(reflectiveCurveTo.e, reflectiveCurveTo2.e, fA), MathHelpersKt.b(reflectiveCurveTo.f, reflectiveCurveTo2.f, fA));
                            } else if (pathNode2 instanceof PathNode.RelativeQuadTo) {
                                if (!(pathNode instanceof PathNode.RelativeQuadTo)) {
                                    throw new IllegalArgumentException("start and stop path nodes have different types");
                                }
                                PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode2;
                                PathNode.RelativeQuadTo relativeQuadTo2 = (PathNode.RelativeQuadTo) pathNode;
                                reflectiveQuadTo = new PathNode.RelativeQuadTo(MathHelpersKt.b(relativeQuadTo.c, relativeQuadTo2.c, fA), MathHelpersKt.b(relativeQuadTo.d, relativeQuadTo2.d, fA), MathHelpersKt.b(relativeQuadTo.e, relativeQuadTo2.e, fA), MathHelpersKt.b(relativeQuadTo.f, relativeQuadTo2.f, fA));
                            } else if (pathNode2 instanceof PathNode.QuadTo) {
                                if (!(pathNode instanceof PathNode.QuadTo)) {
                                    throw new IllegalArgumentException("start and stop path nodes have different types");
                                }
                                PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode2;
                                PathNode.QuadTo quadTo2 = (PathNode.QuadTo) pathNode;
                                reflectiveQuadTo = new PathNode.QuadTo(MathHelpersKt.b(quadTo.c, quadTo2.c, fA), MathHelpersKt.b(quadTo.d, quadTo2.d, fA), MathHelpersKt.b(quadTo.e, quadTo2.e, fA), MathHelpersKt.b(quadTo.f, quadTo2.f, fA));
                            } else if (pathNode2 instanceof PathNode.RelativeReflectiveQuadTo) {
                                if (!(pathNode instanceof PathNode.RelativeReflectiveQuadTo)) {
                                    throw new IllegalArgumentException("start and stop path nodes have different types");
                                }
                                PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode2;
                                PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo2 = (PathNode.RelativeReflectiveQuadTo) pathNode;
                                reflectiveQuadTo = new PathNode.RelativeReflectiveQuadTo(MathHelpersKt.b(relativeReflectiveQuadTo.c, relativeReflectiveQuadTo2.c, fA), MathHelpersKt.b(relativeReflectiveQuadTo.d, relativeReflectiveQuadTo2.d, fA));
                            } else if (pathNode2 instanceof PathNode.ReflectiveQuadTo) {
                                if (!(pathNode instanceof PathNode.ReflectiveQuadTo)) {
                                    throw new IllegalArgumentException("start and stop path nodes have different types");
                                }
                                PathNode.ReflectiveQuadTo reflectiveQuadTo2 = (PathNode.ReflectiveQuadTo) pathNode2;
                                PathNode.ReflectiveQuadTo reflectiveQuadTo3 = (PathNode.ReflectiveQuadTo) pathNode;
                                reflectiveQuadTo = new PathNode.ReflectiveQuadTo(MathHelpersKt.b(reflectiveQuadTo2.c, reflectiveQuadTo3.c, fA), MathHelpersKt.b(reflectiveQuadTo2.d, reflectiveQuadTo3.d, fA));
                            } else if (pathNode2 instanceof PathNode.RelativeArcTo) {
                                if (!(pathNode instanceof PathNode.RelativeArcTo)) {
                                    throw new IllegalArgumentException("start and stop path nodes have different types");
                                }
                                PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode2;
                                PathNode.RelativeArcTo relativeArcTo2 = (PathNode.RelativeArcTo) pathNode;
                                arcTo = new PathNode.RelativeArcTo(MathHelpersKt.b(relativeArcTo.c, relativeArcTo2.c, fA), MathHelpersKt.b(relativeArcTo.d, relativeArcTo2.d, fA), MathHelpersKt.b(relativeArcTo.e, relativeArcTo2.e, fA), relativeArcTo.f, relativeArcTo.g, MathHelpersKt.b(relativeArcTo.h, relativeArcTo2.h, fA), MathHelpersKt.b(relativeArcTo.i, relativeArcTo2.i, fA));
                            } else if (!(pathNode2 instanceof PathNode.ArcTo)) {
                                reflectiveQuadTo = PathNode.Close.c;
                                if (!Intrinsics.c(pathNode2, reflectiveQuadTo)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                if (!(pathNode instanceof PathNode.ArcTo)) {
                                    throw new IllegalArgumentException("start and stop path nodes have different types");
                                }
                                PathNode.ArcTo arcTo2 = (PathNode.ArcTo) pathNode2;
                                PathNode.ArcTo arcTo3 = (PathNode.ArcTo) pathNode;
                                arcTo = new PathNode.ArcTo(MathHelpersKt.b(arcTo2.c, arcTo3.c, fA), MathHelpersKt.b(arcTo2.d, arcTo3.d, fA), MathHelpersKt.b(arcTo2.e, arcTo3.e, fA), arcTo2.f, arcTo2.g, MathHelpersKt.b(arcTo2.h, arcTo3.h, fA), MathHelpersKt.b(arcTo2.i, arcTo3.i, fA));
                            }
                            reflectiveQuadTo = arcTo;
                        } else {
                            if (!(pathNode instanceof PathNode.VerticalTo)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            reflectiveQuadTo = new PathNode.VerticalTo(MathHelpersKt.b(((PathNode.VerticalTo) pathNode2).c, ((PathNode.VerticalTo) pathNode).c, fA));
                        }
                        arrayList3.add(reflectiveQuadTo);
                    }
                    return arrayList3;
                }
            };
            composer.A(objG);
        }
        State stateD = SnapshotStateKt.d((Function0) objG);
        composer.l();
        return stateD;
    }
}
