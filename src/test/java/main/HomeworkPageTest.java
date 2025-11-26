package main;

import components.CatalogCoursesComponent;
import components.popups.AuthPopup;
import extensions.UiExtension;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.CategoriesPage;
import pages.OtusPage;


@ExtendWith(UiExtension.class)
public class OtusPageTest {

    @Inject
    protected CatalogCoursesComponent catalogCoursesComponent;

    @Inject
    protected AuthPopup authPopup;

    @Inject
    protected CategoriesPage categoriesPage;

    @Inject
    protected OtusPage otusPage;

    @Test
    public void clickCategoriesTitle() {

        String title =

                otusPage.open()
                        .getLearningCategory(1);


        otusPage
                .goToLearningSection(title)
                .pageHeaderShowIdBySameUs(title);


        catalogCoursesComponent
                .getComponentEntry()
                .click();

        authPopup.popupShouldBeVisible()
                .popupShouldNotBeVisible()
                .closePopup();
    }


    @Test
    public void selectCourseByName() {


        categoriesPage
                .open("courses", "programming")
                .findCourseByName("QA Automation Engineer");


        catalogCoursesComponent
                .getComponentEntry()
                .click();


        authPopup.popupShouldBeVisible()
                .popupShouldNotBeVisible()
                .closePopup();

    }

}
