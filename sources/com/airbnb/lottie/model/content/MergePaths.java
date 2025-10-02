package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.MergePathsContent;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.Logger;

/* loaded from: classes4.dex */
public class MergePaths implements ContentModel {

    /* renamed from: a, reason: collision with root package name */
    public final MergePathsMode f13411a;
    public final boolean b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MergePathsMode {
        public static final MergePathsMode d;
        public static final MergePathsMode e;
        public static final MergePathsMode f;
        public static final MergePathsMode g;
        public static final MergePathsMode h;
        public static final /* synthetic */ MergePathsMode[] i;

        static {
            MergePathsMode mergePathsMode = new MergePathsMode("MERGE", 0);
            d = mergePathsMode;
            MergePathsMode mergePathsMode2 = new MergePathsMode("ADD", 1);
            e = mergePathsMode2;
            MergePathsMode mergePathsMode3 = new MergePathsMode("SUBTRACT", 2);
            f = mergePathsMode3;
            MergePathsMode mergePathsMode4 = new MergePathsMode("INTERSECT", 3);
            g = mergePathsMode4;
            MergePathsMode mergePathsMode5 = new MergePathsMode("EXCLUDE_INTERSECTIONS", 4);
            h = mergePathsMode5;
            i = new MergePathsMode[]{mergePathsMode, mergePathsMode2, mergePathsMode3, mergePathsMode4, mergePathsMode5};
        }

        public static MergePathsMode valueOf(String str) {
            return (MergePathsMode) Enum.valueOf(MergePathsMode.class, str);
        }

        public static MergePathsMode[] values() {
            return (MergePathsMode[]) i.clone();
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.f13411a = mergePathsMode;
        this.b = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        if (lottieDrawable.l()) {
            return new MergePathsContent(this);
        }
        Logger.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f13411a + '}';
    }
}
