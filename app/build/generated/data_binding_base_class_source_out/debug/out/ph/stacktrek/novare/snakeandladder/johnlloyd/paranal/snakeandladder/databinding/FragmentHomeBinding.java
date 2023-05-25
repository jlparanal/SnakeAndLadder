// Generated by view binder compiler. Do not edit!
package ph.stacktrek.novare.snakeandladder.johnlloyd.paranal.snakeandladder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ph.stacktrek.novare.snakeandladder.johnlloyd.paranal.snakeandladder.R;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final AppCompatButton fourPlayersButton;

  @NonNull
  public final AppCompatImageView imageView;

  @NonNull
  public final AppCompatButton singlePlayerButton;

  @NonNull
  public final AppCompatButton threePlayersButton;

  @NonNull
  public final AppCompatButton twoPlayersButton;

  private FragmentHomeBinding(@NonNull FrameLayout rootView,
      @NonNull AppCompatButton fourPlayersButton, @NonNull AppCompatImageView imageView,
      @NonNull AppCompatButton singlePlayerButton, @NonNull AppCompatButton threePlayersButton,
      @NonNull AppCompatButton twoPlayersButton) {
    this.rootView = rootView;
    this.fourPlayersButton = fourPlayersButton;
    this.imageView = imageView;
    this.singlePlayerButton = singlePlayerButton;
    this.threePlayersButton = threePlayersButton;
    this.twoPlayersButton = twoPlayersButton;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.four_players_button;
      AppCompatButton fourPlayersButton = ViewBindings.findChildViewById(rootView, id);
      if (fourPlayersButton == null) {
        break missingId;
      }

      id = R.id.imageView;
      AppCompatImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.single_player_button;
      AppCompatButton singlePlayerButton = ViewBindings.findChildViewById(rootView, id);
      if (singlePlayerButton == null) {
        break missingId;
      }

      id = R.id.three_players_button;
      AppCompatButton threePlayersButton = ViewBindings.findChildViewById(rootView, id);
      if (threePlayersButton == null) {
        break missingId;
      }

      id = R.id.two_players_button;
      AppCompatButton twoPlayersButton = ViewBindings.findChildViewById(rootView, id);
      if (twoPlayersButton == null) {
        break missingId;
      }

      return new FragmentHomeBinding((FrameLayout) rootView, fourPlayersButton, imageView,
          singlePlayerButton, threePlayersButton, twoPlayersButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}