function taskRoute(datestr, option, n=0) {

    var sp = datestr.split("-");
    var date_format = new Date(sp[0], sp[1] - 1, sp[2]);
    var date = new Date(date_format);
    var output;

    switch (option) {
        case "Tomorrow":
            output = addDays(date, 1);
            break;
        case "Yesterday":
            output = minusDays(date, 1);
            break;
        case "N months earlier":
            output = minusMonths(date, n);
            break;
        case "N years earlier":
            output = minusYears(date, n);
            break;
        case "Date N weeks later":
            output = addWeeks(date, n);
            break;
        case "Date N months later":
            output = addMonths(date, n);
            break;
        case "Date Next Week":
            output = addWeeks(date, 1);
            break;
        case "Day after tomorrow":
            output = addDays(date, 2);
            break;
        case "Day before yesterday":
            output = minusDays(date, 2);
            break;
        case "Add N days":
            output = addDays(date, n);
            break;
        case "Add N months":
            output = addMonths(date, n);
            break;
        case "Add N Weeks":
            output = addWeeks(date, n);
            break;
        case "Add N years":
            output = addYears(date, n);
            break;
        case "Minus N days":
            output = minusDays(date, n);
            break;
        case "Date N years later":
            output = addYears(date, n);
            break;
        case "Date Last Week":
            output = minusWeeks(date, 1);
            break;
        case "Date Last month":
            output = minusMonths(date, 1);
            break;
        case "Date Last year":
            output = minusYears(date, 1);
            break;
        case "Minus N months":
            output = minusMonths(date, n);
            break;
        case "Minus N Weeks":
            output = minusWeeks(date, n);
            break;
        case "Minus N years":
            output = minusYears(date, n);
            break;
        case "Day of the week":
            return getDayOfTheWeek(date);
            break;
        case "N weeks earlier":
            output = minusWeeks(date, n);
            break;
        case "Date Next month":
            output = addMonths(date, 1);
            break;
        case "Date Next year":
            output = addYears(date, 1);
            break;

    }
    return new Date(output).toDateString();
}

function addDays(date, days) {
    var output = new Date(date);
    return output.setDate(output.getDate() + days);
}

function addMonths(date, months) {
    var output = new Date(date);
    let days = Math.floor(months * 30.5);
    return output.setDate(output.getDate() + days);
}

function addWeeks(date, n) {
    var output = new Date(date);
    let days = n * 7;
    return output.setDate(output.getDate() + days);
}

function addYears(date, years) {
    var output = new Date(date);
    let days = years * 365;
    return output.setDate(output.getDate() + days);
}

function minusDays(date, days) {
    var output = new Date(date);
    return output.setDate(output.getDate() - days);
}



function minusMonths(date, months) {
    var output = new Date(date);
    let days = Math.floor(months * 30.5);
    return output.setDate(output.getDate() - days);
}

function minusYears(date, years) {
    var output = new Date(date);
    let days = years * 365;
    return output.setDate(output.getDate() - days);
}

function minusWeeks(date, n) {
    var output = new Date(date);
    let days = n * 7;
    return output.setDate(output.getDate() - days);
}

const days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];

function getDayOfTheWeek(date) {
    return days[date.getDay()];
}


module.exports = { taskRoute }