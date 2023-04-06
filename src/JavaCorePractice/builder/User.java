package JavaCorePractice.builder;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {

    String name;
    int age;
}
