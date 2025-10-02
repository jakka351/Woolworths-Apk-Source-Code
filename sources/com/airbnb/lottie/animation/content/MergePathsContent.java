package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi
/* loaded from: classes4.dex */
public class MergePathsContent implements PathContent, GreedyContent {

    /* renamed from: a, reason: collision with root package name */
    public final Path f13360a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final MergePaths e;

    /* renamed from: com.airbnb.lottie.animation.content.MergePathsContent$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13361a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f13361a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13361a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13361a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13361a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13361a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MergePathsContent(MergePaths mergePaths) {
        this.e = mergePaths;
    }

    public final void b(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.f13360a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            PathContent pathContent = (PathContent) arrayList.get(size);
            if (pathContent instanceof ContentGroup) {
                ContentGroup contentGroup = (ContentGroup) pathContent;
                ArrayList arrayList2 = (ArrayList) contentGroup.c();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((PathContent) arrayList2.get(size2)).getPath();
                    Matrix matrixE = contentGroup.c;
                    TransformKeyframeAnimation transformKeyframeAnimation = contentGroup.k;
                    if (transformKeyframeAnimation != null) {
                        matrixE = transformKeyframeAnimation.e();
                    } else {
                        matrixE.reset();
                    }
                    path3.transform(matrixE);
                    path.addPath(path3);
                }
            } else {
                path.addPath(pathContent.getPath());
            }
        }
        int i = 0;
        PathContent pathContent2 = (PathContent) arrayList.get(0);
        if (pathContent2 instanceof ContentGroup) {
            ContentGroup contentGroup2 = (ContentGroup) pathContent2;
            List listC = contentGroup2.c();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listC;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((PathContent) arrayList3.get(i)).getPath();
                Matrix matrixE2 = contentGroup2.c;
                TransformKeyframeAnimation transformKeyframeAnimation2 = contentGroup2.k;
                if (transformKeyframeAnimation2 != null) {
                    matrixE2 = transformKeyframeAnimation2.e();
                } else {
                    matrixE2.reset();
                }
                path4.transform(matrixE2);
                path2.addPath(path4);
                i++;
            }
        } else {
            path2.set(pathContent2.getPath());
        }
        this.c.op(path2, path, op);
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    public final void c(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            Content content = (Content) listIterator.previous();
            if (content instanceof PathContent) {
                this.d.add((PathContent) content);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void f(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((PathContent) arrayList.get(i)).f(list, list2);
            i++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        Path path = this.c;
        path.reset();
        MergePaths mergePaths = this.e;
        if (!mergePaths.b) {
            int iOrdinal = mergePaths.f13411a.ordinal();
            if (iOrdinal == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((PathContent) arrayList.get(i)).getPath());
                    i++;
                }
            } else {
                if (iOrdinal == 1) {
                    b(Path.Op.UNION);
                    return path;
                }
                if (iOrdinal == 2) {
                    b(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iOrdinal == 3) {
                    b(Path.Op.INTERSECT);
                    return path;
                }
                if (iOrdinal == 4) {
                    b(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
