package me.oriient.ipssdk.ips;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.StringRes;
import androidx.annotation.UiThread;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSCalibrationDialogDismissListener;
import me.oriient.ipssdk.api.listeners.IPSCalibrationDialogShowListener;
import me.oriient.ipssdk.api.listeners.IPSCalibrationFinishedListener;
import me.oriient.ipssdk.base.di.java.JavaDi;
import me.oriient.ipssdk.base.di.java.Lazy;
import me.oriient.ipssdk.realtime.R;

@Keep
@TargetApi
/* loaded from: classes4.dex */
public class IPSCalibrationDialog {
    private static final String TAG = "IPSCalibrationDialog";
    private TextView calibrationCompletedMessage;
    private View calibrationDoneImage;
    private View calibrationImage;
    private TextView calibrationInstructions;
    private TextView calibrationProgressMessage;
    private TextView calibrationTitle;
    private TextView calibrationTopInfo;
    private RelativeLayout calibrationTopInfoWrapper;

    @NonNull
    private final AlertDialog dialog;
    private boolean isShowing;

    @NonNull
    private final Lazy<Logger> logger;
    private final DialogInterface.OnShowListener onShowListener;
    private ProgressBar progressBar;

    @NonNull
    private final IPSCalibrationDialogViewModel viewModel;

    @Keep
    public static class Builder {

        @NonNull
        private final FragmentActivity activity;
        private boolean addCancelButton;
        private boolean addDismissButton;

        @Nullable
        private Integer calibrationAnimationAsset;

        @Nullable
        private Integer successImage;

        @NonNull
        private final IPSCalibrationDialogViewModel viewModel = new IPSCalibrationDialogViewModel();

        @NonNull
        private String dismissStr = "Dismiss";

        @NonNull
        private String cancelStr = "Cancel";

        public Builder(@NonNull FragmentActivity fragmentActivity) {
            this.activity = fragmentActivity;
        }

        public Builder addCancelButton() {
            this.addCancelButton = true;
            return this;
        }

        public Builder addDismissButton() {
            this.addDismissButton = true;
            return this;
        }

        @NonNull
        @UiThread
        public IPSCalibrationDialog create() {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.activity);
            builder.setCancelable(false);
            if (this.addDismissButton) {
                builder.setPositiveButton(this.dismissStr, (DialogInterface.OnClickListener) null);
            }
            if (this.addCancelButton) {
                builder.setNegativeButton(this.cancelStr, (DialogInterface.OnClickListener) null);
            }
            View viewInflate = LayoutInflater.from(this.activity).inflate(R.layout.ips_calibration_dialog, (ViewGroup) null);
            if (this.successImage != null) {
                ((ImageView) viewInflate.findViewById(R.id.calibration_done_image)).setImageDrawable(this.activity.getDrawable(this.successImage.intValue()));
            }
            if (this.viewModel.accentColor != null) {
                int i = R.id.calibration_progress_bar;
                ((ProgressBar) viewInflate.findViewById(i)).setProgressTintList(ColorStateList.valueOf(this.viewModel.accentColor.intValue()));
                ((ProgressBar) viewInflate.findViewById(i)).setIndeterminateTintList(ColorStateList.valueOf(this.viewModel.accentColor.intValue()));
                ((TextView) viewInflate.findViewById(R.id.calibration_completed_message)).setTextColor(this.viewModel.accentColor.intValue());
                ((TextView) viewInflate.findViewById(R.id.calibration_instructions)).setTextColor(this.viewModel.accentColor.intValue());
                ((ImageView) viewInflate.findViewById(R.id.calibration_done_image)).setColorFilter(this.viewModel.accentColor.intValue(), PorterDuff.Mode.SRC_IN);
                viewInflate.findViewById(R.id.calibration_top_info_wrapper).setBackgroundColor(this.viewModel.accentColor.intValue());
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) viewInflate.findViewById(R.id.calibration_image);
            Integer num = this.calibrationAnimationAsset;
            if (num != null) {
                lottieAnimationView.setAnimation(num.intValue());
            } else {
                lottieAnimationView.setSpeed(0.63f);
            }
            builder.setView(viewInflate);
            return new IPSCalibrationDialog(builder.create(), this.activity, this.viewModel, this.addCancelButton, this.addDismissButton, this.calibrationAnimationAsset != null, 0);
        }

        public Builder removeCancelButton() {
            this.addCancelButton = false;
            return this;
        }

        public Builder removeDismissButton() {
            this.addDismissButton = false;
            return this;
        }

        public Builder setAccentColor(@ColorInt int i) {
            this.viewModel.accentColor = Integer.valueOf(i);
            return this;
        }

        public Builder setCalibrationAnimationAsset(@RawRes int i) {
            this.calibrationAnimationAsset = Integer.valueOf(i);
            return this;
        }

        public Builder setCancelButtonText(@NonNull String str) {
            this.cancelStr = str;
            return this;
        }

        public Builder setDismissButtonText(@NonNull String str) {
            this.dismissStr = str;
            return this;
        }

        public Builder setInstructionsText(@NonNull String str) {
            this.viewModel.calibrationInstructionsText = str;
            return this;
        }

        public Builder setProgressTextFormatted(@NonNull String str) {
            this.viewModel.calibrationProgressText = str;
            return this;
        }

        public Builder setSuccessDismissDelay(long j) {
            this.viewModel.dismissDelay = j;
            return this;
        }

        public Builder setSuccessImage(@DrawableRes int i) {
            this.successImage = Integer.valueOf(i);
            return this;
        }

        public Builder setSuccessMessageText(@NonNull String str) {
            this.viewModel.calibrationSuccessText = str;
            return this;
        }

        @Deprecated
        public Builder setTitle(@NonNull String str) {
            this.viewModel.calibrationTitleTextByReason.put(0, str);
            return this;
        }

        public Builder setTopInfoPanelText(@NonNull String str) {
            this.viewModel.calibrationTopInfoText = str;
            return this;
        }

        public Builder setWaitingToStartMessageText(@NonNull String str) {
            this.viewModel.waitingToStartText = str;
            return this;
        }

        public Builder setCancelButtonText(@StringRes int i) {
            this.cancelStr = this.activity.getString(i);
            return this;
        }

        public Builder setDismissButtonText(@StringRes int i) {
            this.dismissStr = this.activity.getString(i);
            return this;
        }

        public Builder setInstructionsText(@StringRes int i) {
            this.viewModel.calibrationInstructionsText = this.activity.getString(i);
            return this;
        }

        public Builder setProgressTextFormatted(@StringRes int i) {
            this.viewModel.calibrationProgressText = this.activity.getString(i);
            return this;
        }

        public Builder setSuccessMessageText(@StringRes int i) {
            this.viewModel.calibrationSuccessText = this.activity.getString(i);
            return this;
        }

        @Deprecated
        public Builder setTitle(@StringRes int i) {
            this.viewModel.calibrationTitleTextByReason.put(0, this.activity.getString(i));
            return this;
        }

        public Builder setTopInfoPanelText(@StringRes int i) {
            this.viewModel.calibrationTopInfoText = this.activity.getString(i);
            return this;
        }

        public Builder setWaitingToStartMessageText(@StringRes int i) {
            this.viewModel.waitingToStartText = this.activity.getString(i);
            return this;
        }

        public Builder setTitle(@NonNull String str, int i) {
            this.viewModel.calibrationTitleTextByReason.put(Integer.valueOf(i), str);
            return this;
        }

        public Builder setTitle(@StringRes int i, int i2) {
            this.viewModel.calibrationTitleTextByReason.put(Integer.valueOf(i2), this.activity.getString(i));
            return this;
        }
    }

    public /* synthetic */ IPSCalibrationDialog(AlertDialog alertDialog, FragmentActivity fragmentActivity, IPSCalibrationDialogViewModel iPSCalibrationDialogViewModel, boolean z, boolean z2, boolean z3, int i) {
        this(alertDialog, fragmentActivity, iPSCalibrationDialogViewModel, z, z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelCalibration() {
        this.viewModel.onDismissCalled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void colorDefaultAnimation(final int i, @NonNull LottieAnimationView lottieAnimationView) {
        KeyPath keyPath = new KeyPath("new phone no background-01 Outlines", "Group 3", "**");
        ColorFilter colorFilter = LottieProperty.F;
        final int i2 = 10;
        lottieAnimationView.c(keyPath, colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i2) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i3 = 1;
        lottieAnimationView.c(new KeyPath("new phone no background-02 Outlines", "Group 3", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i3) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i4 = 2;
        lottieAnimationView.c(new KeyPath("new phone no background-03 Outlines", "Group 3", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i4) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i5 = 3;
        lottieAnimationView.c(new KeyPath("new phone no background-04 Outlines", "Group 4", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i5) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i6 = 4;
        lottieAnimationView.c(new KeyPath("new phone no background-05 Outlines", "Group 8", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i6) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i7 = 5;
        lottieAnimationView.c(new KeyPath("new phone no background-06 Outlines", "Group 3", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i7) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i8 = 6;
        lottieAnimationView.c(new KeyPath("new phone no background-07 Outlines", "Group 2", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i8) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i9 = 7;
        lottieAnimationView.c(new KeyPath("new phone no background-08 Outlines", "Group 2", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i9) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i10 = 8;
        lottieAnimationView.c(new KeyPath("new phone no background-09 Outlines", "Group 2", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i10) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i11 = 9;
        lottieAnimationView.c(new KeyPath("new phone no background-10 Outlines", "Group 2", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i11) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i12 = 11;
        lottieAnimationView.c(new KeyPath("new phone no background-11 Outlines", "Group 2", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i12) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i13 = 12;
        lottieAnimationView.c(new KeyPath("new phone no background-12 Outlines", "Group 2", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i13) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i14 = 13;
        lottieAnimationView.c(new KeyPath("new phone no background-13 Outlines", "Group 3", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i14) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i15 = 14;
        lottieAnimationView.c(new KeyPath("new phone no background-14 Outlines", "Group 2", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i15) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i16 = 15;
        lottieAnimationView.c(new KeyPath("new phone no background-15 Outlines", "Group 2", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i16) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
        final int i17 = 0;
        lottieAnimationView.c(new KeyPath("new phone no background-16 Outlines", "Group 2", "**"), colorFilter, new SimpleLottieValueCallback() { // from class: me.oriient.ipssdk.ips.v
            @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
            public final ColorFilter a(LottieFrameInfo lottieFrameInfo) {
                switch (i17) {
                    case 0:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$15(i, lottieFrameInfo);
                    case 1:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$1(i, lottieFrameInfo);
                    case 2:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$2(i, lottieFrameInfo);
                    case 3:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$3(i, lottieFrameInfo);
                    case 4:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$4(i, lottieFrameInfo);
                    case 5:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$5(i, lottieFrameInfo);
                    case 6:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$6(i, lottieFrameInfo);
                    case 7:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$7(i, lottieFrameInfo);
                    case 8:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$8(i, lottieFrameInfo);
                    case 9:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$9(i, lottieFrameInfo);
                    case 10:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$0(i, lottieFrameInfo);
                    case 11:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$10(i, lottieFrameInfo);
                    case 12:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$11(i, lottieFrameInfo);
                    case 13:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$12(i, lottieFrameInfo);
                    case 14:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$13(i, lottieFrameInfo);
                    default:
                        return IPSCalibrationDialog.lambda$colorDefaultAnimation$14(i, lottieFrameInfo);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissDialog() {
        this.viewModel.onDismissCalled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$0(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$1(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$10(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$11(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$12(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$13(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$14(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$15(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$2(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$3(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$4(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$5(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$6(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$7(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$8(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorFilter lambda$colorDefaultAnimation$9(int i, LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribeToUiComponents$16(String str) {
        this.calibrationTopInfo.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribeToUiComponents$17(FragmentActivity fragmentActivity, String str) {
        fragmentActivity.runOnUiThread(new com.auth0.android.request.internal.a(11, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribeToUiComponents$18(Boolean bool) {
        this.calibrationTopInfoWrapper.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribeToUiComponents$19(FragmentActivity fragmentActivity, Boolean bool) {
        fragmentActivity.runOnUiThread(new com.auth0.android.request.internal.a(10, this, bool));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void subscribeToUiComponents(@NonNull AlertDialog alertDialog, @NonNull final FragmentActivity fragmentActivity) {
        this.logger.getValue().d(TAG, "subscribeToUiComponents() called with: dialog = [" + alertDialog + "], activity = [" + fragmentActivity + "]");
        this.calibrationImage = alertDialog.findViewById(R.id.calibration_image);
        this.calibrationDoneImage = alertDialog.findViewById(R.id.calibration_done_image);
        this.calibrationProgressMessage = (TextView) alertDialog.findViewById(R.id.calibration_progress_message);
        this.calibrationCompletedMessage = (TextView) alertDialog.findViewById(R.id.calibration_completed_message);
        this.progressBar = (ProgressBar) alertDialog.findViewById(R.id.calibration_progress_bar);
        this.calibrationInstructions = (TextView) alertDialog.findViewById(R.id.calibration_instructions);
        this.calibrationTitle = (TextView) alertDialog.findViewById(R.id.calibration_title);
        this.calibrationTopInfo = (TextView) alertDialog.findViewById(R.id.calibration_top_info_text);
        this.calibrationTopInfoWrapper = (RelativeLayout) alertDialog.findViewById(R.id.calibration_top_info_wrapper);
        this.viewModel.calibrationProgress.f(fragmentActivity, new g(this, fragmentActivity));
        this.viewModel.calibrationProgressMessage.f(fragmentActivity, new i(this, fragmentActivity));
        final int i = 0;
        this.viewModel.calibrationTopInfo.f(fragmentActivity, new Observer(this) { // from class: me.oriient.ipssdk.ips.w
            public final /* synthetic */ IPSCalibrationDialog e;

            {
                this.e = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                switch (i) {
                    case 0:
                        this.e.lambda$subscribeToUiComponents$17(fragmentActivity, (String) obj);
                        break;
                    default:
                        this.e.lambda$subscribeToUiComponents$19(fragmentActivity, (Boolean) obj);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.viewModel.calibrationTopInfoVisible.f(fragmentActivity, new Observer(this) { // from class: me.oriient.ipssdk.ips.w
            public final /* synthetic */ IPSCalibrationDialog e;

            {
                this.e = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                switch (i2) {
                    case 0:
                        this.e.lambda$subscribeToUiComponents$17(fragmentActivity, (String) obj);
                        break;
                    default:
                        this.e.lambda$subscribeToUiComponents$19(fragmentActivity, (Boolean) obj);
                        break;
                }
            }
        });
        this.viewModel.calibrationTitle.f(fragmentActivity, new k(this, fragmentActivity));
        this.viewModel.calibrationInstructions.f(fragmentActivity, new m(this, fragmentActivity));
        this.viewModel.calibrationSuccessMessage.f(fragmentActivity, new o(this, fragmentActivity));
        this.viewModel.didReceiveUpdate.f(fragmentActivity, new q(this, fragmentActivity));
    }

    public void dismiss() {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "dismiss() called");
        this.dialog.setOnShowListener(null);
        this.viewModel.onDismissCalled(false);
    }

    public boolean isShowing() {
        Boolean bool = (Boolean) this.viewModel.show.e();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public void setOnCalibrationFinishedListener(@Nullable IPSCalibrationFinishedListener iPSCalibrationFinishedListener) {
        this.viewModel.calibrationFinishedListener = iPSCalibrationFinishedListener;
    }

    public void setOnDismissListener(@Nullable IPSCalibrationDialogDismissListener iPSCalibrationDialogDismissListener) {
        this.viewModel.dismissListener = iPSCalibrationDialogDismissListener;
    }

    public void setOnShowListener(@Nullable IPSCalibrationDialogShowListener iPSCalibrationDialogShowListener) {
        this.viewModel.showListener = iPSCalibrationDialogShowListener;
    }

    public void show() {
        ((ELog) JavaDi.get(ELog.class)).api(TAG, "show() called");
        this.dialog.setOnShowListener(this.onShowListener);
        this.viewModel.onShowCalled();
    }

    private IPSCalibrationDialog(@NonNull AlertDialog alertDialog, @NonNull FragmentActivity fragmentActivity, @NonNull IPSCalibrationDialogViewModel iPSCalibrationDialogViewModel, boolean z, boolean z2, boolean z3) {
        this.logger = JavaDi.inject(Logger.class);
        this.viewModel = iPSCalibrationDialogViewModel;
        this.dialog = alertDialog;
        this.onShowListener = new c(this, alertDialog, iPSCalibrationDialogViewModel, z3, z2, z, fragmentActivity);
        iPSCalibrationDialogViewModel.show.f(fragmentActivity, new d(alertDialog));
        iPSCalibrationDialogViewModel.calibrationProgress.f(fragmentActivity, new e(z2, alertDialog, z));
    }
}
