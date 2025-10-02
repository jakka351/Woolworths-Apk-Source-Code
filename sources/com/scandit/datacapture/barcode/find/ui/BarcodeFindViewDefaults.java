package com.scandit.datacapture.barcode.find.ui;

import com.scandit.datacapture.core.common.geometry.Anchor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R \u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001b\u0010\u0018R\"\u0010\u001d\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u0012\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001e\u0010\u0018R\"\u0010 \u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0016\u0012\u0004\b\"\u0010\u0012\u001a\u0004\b!\u0010\u0018R\"\u0010#\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0016\u0012\u0004\b%\u0010\u0012\u001a\u0004\b$\u0010\u0018R\"\u0010&\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u0016\u0012\u0004\b(\u0010\u0012\u001a\u0004\b'\u0010\u0018R\"\u0010)\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u0016\u0012\u0004\b+\u0010\u0012\u001a\u0004\b*\u0010\u0018R\"\u0010,\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010\u0016\u0012\u0004\b.\u0010\u0012\u001a\u0004\b-\u0010\u0018¨\u0006/"}, d2 = {"Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindViewDefaults;", "", "", "defaultShouldShowUserGuidanceView", "Z", "defaultShouldShowHints", "defaultShouldShowCarousel", "defaultShouldShowPauseButton", "defaultShouldShowFinishButton", "defaultShouldShowProgressBar", "defaultShouldShowTorchControl", "defaultShouldShowZoomControl", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "a", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getDefaultTorchControlPosition", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getDefaultTorchControlPosition$annotations", "()V", "defaultTorchControlPosition", "", "defaultTextForCollapseCardsButton", "Ljava/lang/String;", "getDefaultTextForCollapseCardsButton", "()Ljava/lang/String;", "getDefaultTextForCollapseCardsButton$annotations", "defaultTextForAllItemsFoundSuccessfullyHint", "getDefaultTextForAllItemsFoundSuccessfullyHint", "getDefaultTextForAllItemsFoundSuccessfullyHint$annotations", "defaultTextForPointAtBarcodesToSearchHint", "getDefaultTextForPointAtBarcodesToSearchHint", "getDefaultTextForPointAtBarcodesToSearchHint$annotations", "defaultTextForMoveCloserToBarcodesHint", "getDefaultTextForMoveCloserToBarcodesHint", "getDefaultTextForMoveCloserToBarcodesHint$annotations", "defaultTextForTapShutterToPauseScreenHint", "getDefaultTextForTapShutterToPauseScreenHint", "getDefaultTextForTapShutterToPauseScreenHint$annotations", "defaultTextForTapShutterToResumeSearchHint", "getDefaultTextForTapShutterToResumeSearchHint", "getDefaultTextForTapShutterToResumeSearchHint$annotations", "defaultTextForItemListUpdatedHint", "getDefaultTextForItemListUpdatedHint", "getDefaultTextForItemListUpdatedHint$annotations", "defaultTextForItemListUpdatedWhenPausedHint", "getDefaultTextForItemListUpdatedWhenPausedHint", "getDefaultTextForItemListUpdatedWhenPausedHint$annotations", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeFindViewDefaults {

    @NotNull
    public static final BarcodeFindViewDefaults INSTANCE = new BarcodeFindViewDefaults();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final Anchor defaultTorchControlPosition = Anchor.TOP_LEFT;
    public static final boolean defaultShouldShowCarousel = true;
    public static final boolean defaultShouldShowFinishButton = true;
    public static final boolean defaultShouldShowHints = true;
    public static final boolean defaultShouldShowPauseButton = true;
    public static final boolean defaultShouldShowProgressBar = false;
    public static final boolean defaultShouldShowTorchControl = false;
    public static final boolean defaultShouldShowUserGuidanceView = true;
    public static final boolean defaultShouldShowZoomControl = false;

    private BarcodeFindViewDefaults() {
    }

    @Nullable
    public static final String getDefaultTextForAllItemsFoundSuccessfullyHint() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTextForAllItemsFoundSuccessfullyHint$annotations() {
    }

    @Nullable
    public static final String getDefaultTextForCollapseCardsButton() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTextForCollapseCardsButton$annotations() {
    }

    @Nullable
    public static final String getDefaultTextForItemListUpdatedHint() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTextForItemListUpdatedHint$annotations() {
    }

    @Nullable
    public static final String getDefaultTextForItemListUpdatedWhenPausedHint() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTextForItemListUpdatedWhenPausedHint$annotations() {
    }

    @Nullable
    public static final String getDefaultTextForMoveCloserToBarcodesHint() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTextForMoveCloserToBarcodesHint$annotations() {
    }

    @Nullable
    public static final String getDefaultTextForPointAtBarcodesToSearchHint() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTextForPointAtBarcodesToSearchHint$annotations() {
    }

    @Nullable
    public static final String getDefaultTextForTapShutterToPauseScreenHint() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTextForTapShutterToPauseScreenHint$annotations() {
    }

    @Nullable
    public static final String getDefaultTextForTapShutterToResumeSearchHint() {
        return null;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTextForTapShutterToResumeSearchHint$annotations() {
    }

    @NotNull
    public static final Anchor getDefaultTorchControlPosition() {
        return defaultTorchControlPosition;
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTorchControlPosition$annotations() {
    }
}
