package dragon.bakuman.iu.fragmentexamplexml;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HeadlineFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //from this method onCreateView, we can inflate the layout

        View view = inflater.inflate(R.layout.headline_fragment_layout, container, false);
        return view;

    }
}
