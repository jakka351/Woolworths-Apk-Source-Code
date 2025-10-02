package com.scandit.datacapture.core.internal.sdk.extensions;

import com.scandit.datacapture.core.common.geometry.Anchor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0001¨\u0006\u0004"}, d2 = {"rotate90DegreesCounterClockwise", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "toGravity", "", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnchorExtensionsKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Anchor.values().length];
            try {
                iArr[Anchor.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Anchor.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Anchor.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Anchor.CENTER_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Anchor.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Anchor.CENTER_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Anchor.BOTTOM_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Anchor.BOTTOM_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Anchor.BOTTOM_RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Anchor rotate90DegreesCounterClockwise(@NotNull Anchor anchor) {
        Intrinsics.h(anchor, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[anchor.ordinal()]) {
            case 1:
                return Anchor.BOTTOM_LEFT;
            case 2:
                return Anchor.CENTER_LEFT;
            case 3:
                return Anchor.TOP_LEFT;
            case 4:
                return Anchor.BOTTOM_CENTER;
            case 5:
                return Anchor.CENTER;
            case 6:
                return Anchor.TOP_CENTER;
            case 7:
                return Anchor.BOTTOM_RIGHT;
            case 8:
                return Anchor.CENTER_RIGHT;
            case 9:
                return Anchor.TOP_RIGHT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int toGravity(@NotNull Anchor anchor) {
        Intrinsics.h(anchor, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[anchor.ordinal()]) {
            case 1:
                return 8388659;
            case 2:
                return 49;
            case 3:
                return 8388661;
            case 4:
                return 8388627;
            case 5:
                return 17;
            case 6:
                return 8388629;
            case 7:
                return 8388691;
            case 8:
                return 81;
            case 9:
                return 8388693;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
