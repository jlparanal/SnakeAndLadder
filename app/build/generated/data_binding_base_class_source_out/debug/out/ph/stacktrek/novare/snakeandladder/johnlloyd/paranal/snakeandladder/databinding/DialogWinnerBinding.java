// Generated by view binder compiler. Do not edit!
package ph.stacktrek.novare.snakeandladder.johnlloyd.paranal.snakeandladder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ph.stacktrek.novare.snakeandladder.johnlloyd.paranal.snakeandladder.R;

public final class DialogWinnerBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final AppCompatButton okButton;

  @NonNull
  public final AppCompatTextView winnerText;

  private DialogWinnerBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull AppCompatButton okButton, @NonNull AppCompatTextView winnerText) {
    this.rootView = rootView;
    this.okButton = okButton;
    this.winnerText = winnerText;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogWinnerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogWinnerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_winner, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogWinnerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ok_button;
      AppCompatButton okButton = ViewBindings.findChildViewById(rootView, id);
      if (okButton == null) {
        break missingId;
      }

      id = R.id.winner_text;
      AppCompatTextView winnerText = ViewBindings.findChildViewById(rootView, id);
      if (winnerText == null) {
        break missingId;
      }

      return new DialogWinnerBinding((LinearLayoutCompat) rootView, okButton, winnerText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
